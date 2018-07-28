Java Github API Demo
====================

Try use Java version of github-api to interact with github.

Options:

- <s>[kohsuke/github-api]<http://github-api.kohsuke.org/></s>: Bad documentation, hard to start
- <s>[jcabi-github](https://github.com/jcabi/jcabi-github)</s>: Bad api define and documentation, hard to use
- **[org.eclipse.egit.github.core](https://github.com/eclipse/egit-github/tree/master/org.eclipse.egit.github.core)**: Good design and easy to use, recommend!

Use [org.eclipse.egit.github.core](https://github.com/eclipse/egit-github/tree/master/org.eclipse.egit.github.core) to interact with github.

You need to create an access token in your github account, and create a `github-token.txt` in the root of your project, with the content of the token.

Run Java files under the `demo` package in your IDE.

Attention
---------

1. Make sure you never include your `github-token.txt` file in git or share to others
2. Some of the github-api urls are blocked or unstable in some countries. If you can't get response in reasonable time, try run the code through proxies.

Resources
---------

- All github libraries: <https://developer.github.com/v3/libraries/>