app.use(session({
    secret: 'my-secret'
}));

app.post('/login', (req, res) => {
    // authenticate the user
    passport.authenticate('local', (err, user, info) => {
        if (err) {
            // handle the error
        } else if (user) {
            // the user is authenticated
            res.redirect('/');
        } else {
            // the user is not authenticated
            res.send('Invalid username or password');
        }
    });
});