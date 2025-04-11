document.addEventListener("DOMContentLoaded", function () {
    refreshCaptcha();
});

function refreshCaptcha() {
    fetch("/api/captcha/generate")
        .then(response => response.text())
        .then(data => {
            document.getElementById("captcha-text").innerText = data; // Ensure correct case display
        })
        .catch(error => console.error("Error fetching CAPTCHA:", error));
}

document.querySelector("form").addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent form submission

    let inputCaptcha = document.getElementById("captcha").value.trim();
    let generatedCaptcha = document.getElementById("captcha-text").innerText.trim();

    // ✅ Case-Sensitive Validation
    if (inputCaptcha !== generatedCaptcha) {
        alert("Invalid CAPTCHA! Please enter the correct CAPTCHA.");
        refreshCaptcha();
        return;
    }

    // If CAPTCHA is correct, proceed with form submission
    alert("Form submitted successfully");
    event.target.submit();
});
