DESCRIPTION = "Code Signing Tool for NXP's High Assurance Boot with i.MX processors."
AUTHOR = "NXP"
HOMEPAGE = "http://www.nxp.com"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://Release_Notes.txt;md5=ec86609b539c71fe8c987febd93ee14e"

SRC_URI = "https://cache.nxp.com:443/secured/NMG/MAD/cst-2.3.2.tar.gz?__gda__=1482269283_bd01e5a10349c77d9b69a7329342fb35&fileExt=.gz;downloadfilename=cst-2.3.2.tar.gz"
SRC_URI[md5sum] = "a81766cab2e184ab12e459c0476f6639"
SRC_URI[sha256sum] = "064bfe407ab8616d8caa2fa15c0b87b4a683535e08f95af7179ffaa7c2b74e32"

inherit native

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
  mkdir -p ${D}${bindir}
  install -m 0755 ${S}${SRCDIR}/cst ${D}${bindir}
  install -m 0755 ${S}${SRCDIR}/srktool ${D}${bindir}
  install -m 0755 ${S}${SRCDIR}/x5092wtls ${D}${bindir}
}

COMPATIBLE_HOST = "(i.86|x86_64).*-linux"
SRCDIR_x86-64 = "/linux64"
SRCDIR_x86 = "/linux32"