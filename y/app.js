document.addEventListener("DOMContentLoaded", event => {

    const app = firebase.app();
    console.log(app);

    function googleLogin() {
        const provider = new firebase.auth().signInWithPopup(provider)
            .then(reult => {
                const user = result.user;
                document.write("Hello $user.displayName");
                console.log(user)
        })
        .catch(console.log)
    }

});