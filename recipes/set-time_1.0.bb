SUMMARY = "Set-time shell script"
AUTHOR = "Christophe BLAESS <christophe.blaess@logilin.fr>"
DESCRIPTION = "Shell script to initialize clock on embedded linux systems"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "                                                                         \
           git://git@github.com/logilin/set-time-script.git;protocol=ssh;rev=${PV}  \
          "

inherit update-rc.d
INITSCRIPT_NAME = "set-time"
INITSCRIPT_PARAMS = "start 80 2 3 4 5 ."

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${sbindir}
	install -m 755 ${S}/set-time ${D}${sbindir}

	install -d ${D}${sysconfdir}/init.d
	install -m 755 ${S}/recipes/service-start/set-time-sysvinit ${D}${sysconfdir}/init.d/set-time

}

