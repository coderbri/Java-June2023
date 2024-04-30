function detectPage() {
    // Get the current URL path
    var path = window.location.pathname;
    console.log(path);
    
    // Extract the page name from the URL path
    var pageName = path.substring(path.lastIndexOf('/') + 1);
    // console.log(pageName);
    
    // Check if the page name matches "date.jsp" or "time.jsp"
    if (pageName === "date") {
        alert("You are on the Date page!");
    } else if (pageName === "time") {
        alert("You are on the Time page!");
    }
}

// Call the detectPage function when the document is ready
document.addEventListener("DOMContentLoaded", function() {
    detectPage();
});
