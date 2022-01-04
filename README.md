# Set-time script

This is a small script I use in embedded Linux systems to set the system clock
from several sources: first from the hardware clock (a.k.a. RTC, Real Time
Clock), then from a remote NTP (Network Time Protocol) server.

The script also regularly update system and hardware clocks from the NTP
server.

This script is mainly useful on `sysvinit`-based systems, because on
`systemd`-based systems the `systemd-timesyncd` service is already present.

Note that even if I use this script on some real embedded systems, the current
repository was mostly created as an example for my Yocto Project training
sessions.


## Usage

The script is intended to be run in background, for example:

```
$ set-time &
$
```


## Recipes

A Yocto Project recipe is present with a `sysvinit` startup script.
This way, the script will automatically start at system boot.

You can copy the `set-time_1.0.bb` file directly into a custom layer.


## Licences

The `set-time.sh` script and the Yocto Project recipe are distributed under
GPLv.2 license terms. The present documention is distributed under Creative
Commons 4.0 CC-By-Sa.


## Author

Christophe BLAESS 
https://www.blaess.fr/christophe

