const routes = {
    404: "/homework_07/pages/404.html",
    "/home": "/homework_07/pages/home.html",
    "/clothes": "/homework_07/pages/clothes.html",
    "/shoes": "/homework_07/pages/shoes.html",
    "/accessories": "/homework_07/pages/accessories.html",
    "/homework_07/index.html": "/homework_07/pages/home.html"

};

const route = (event) => {
    event = event || window.event;
    event.preventDefault();
    window.history.pushState({}, "", event.target.href);
    handleLocation();
}

const handleLocation = async () => {
    const path = window.location.pathname;
    console.log(path);
    const route = routes[path] || routes[404];
    const html = await fetch(route).then((data) => data.text());
    document.getElementById("main-page").innerHTML = html;
};

window.onpopstate = handleLocation;
window.route = route;

handleLocation();