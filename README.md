# u2flib
A Java library for accessing FIDO U2F USB tokens for app registration, challenge signing and signature verification.

This library is based on [hid4java](https://github.com/gary-rowe/hid4java) for USB HID access and
 it is ported from [u2f](https://github.com/flynn/u2f) and [u2fcli] (https://github.com/mdp/u2fcli)


### How FIDO U2F Works
Check out [the slides](https://fidoalliance.org/wp-content/uploads/U2F-FIDO_Czeskis.pdf) by Alexei Czeskis (Google) which provides an overview of how an U2F token can make your service more secure. Flowcharts of **Registration** and **Authentication** and a real example should make you more confident before integrating the library.
