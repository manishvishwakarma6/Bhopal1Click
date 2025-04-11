let currentHighlightIndex = -1; // Track the current highlighted word
let highlightedElements = []; // Store all matching words

function filterText() {
    let input = document.getElementById("searchBox").value.toLowerCase().trim();
    let elements = document.querySelectorAll("p, h1, h2, h3, h4, h5, h6");

    resetHighlights(); // Clear previous highlights

    if (input === "") return;

    let regex = new RegExp(`\\b${input}\\b`, "gi"); // Match whole word
    highlightedElements = []; // Reset highlight list

    elements.forEach(element => {
        let text = element.dataset.originalText || element.innerHTML;
        element.dataset.originalText = text; // Store original text

        let matches = [...text.matchAll(regex)]; // Find all matches

        if (matches.length > 0) {
            let highlightedText = text.replace(regex, (match, offset) => {
                highlightedElements.push({ element, match, offset });
                return `<mark class="highlight">${match}</mark>`;
            });

            element.innerHTML = highlightedText;
        }
    });

    if (highlightedElements.length > 0) {
        currentHighlightIndex = 0; // Start from the first match
        updateHighlight(currentHighlightIndex);
    } else {
        alert("No matching word found!");
    }
}

// Function to reset all highlights
function resetHighlights() {
    let elements = document.querySelectorAll("p, h1, h2, h3, h4, h5, h6");
    elements.forEach(element => {
        if (element.dataset.originalText) {
            element.innerHTML = element.dataset.originalText;
        }
    });
    highlightedElements = [];
    currentHighlightIndex = -1;
}

// Function to update highlight for current index
function updateHighlight(index) {
    document.querySelectorAll(".highlight").forEach(mark => mark.classList.remove("active-highlight"));

    if (highlightedElements.length > 0 && index < highlightedElements.length) {
        let markElements = document.querySelectorAll(".highlight");
        if (markElements.length > 0) {
            markElements[index].classList.add("active-highlight"); // Add highlight class
            markElements[index].scrollIntoView({ behavior: "smooth", block: "center" });
        }
    }
}

// Detect Enter Key Press for Navigation
document.getElementById("searchBox").addEventListener("keypress", function (event) {
    if (event.key === "Enter") {
        event.preventDefault();

        if (highlightedElements.length > 0) {
            currentHighlightIndex = (currentHighlightIndex + 1) % highlightedElements.length;
            updateHighlight(currentHighlightIndex);
        } else {
            filterText();
        }
    }
});

// Detect input change to remove highlights when text is deleted
document.getElementById("searchBox").addEventListener("input", function () {
    if (this.value.trim() === "") {
        resetHighlights();
    }
});

// Add CSS to style active highlight
const style = document.createElement("style");
style.innerHTML = `
    .highlight { background-color: yellow; }
    .active-highlight { background-color: red; font-weight: 600px; }
`;
document.head.appendChild(style);
