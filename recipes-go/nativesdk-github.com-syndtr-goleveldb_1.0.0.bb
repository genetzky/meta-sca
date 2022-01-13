SUMMARY = "go.mod: github.com/syndtr/goleveldb"
HOMEPAGE = "https://pkg.go.dev/github.com/syndtr/goleveldb"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-syndtr-goleveldb-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-snappy \
    nativesdk-github.com-onsi-ginkgo \
    nativesdk-github.com-onsi-gomega \
"
GO_IMPORT = "github.com/syndtr/goleveldb"
inherit gosrc
inherit nativesdk
