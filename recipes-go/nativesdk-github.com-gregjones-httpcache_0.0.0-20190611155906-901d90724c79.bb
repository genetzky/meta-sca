SUMMARY = "go.mod: github.com/gregjones/httpcache"
HOMEPAGE = "https://pkg.go.dev/github.com/gregjones/httpcache"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gregjones-httpcache-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-bradfitz-gomemcache \
    nativesdk-github.com-gomodule-redigo-redis \
    nativesdk-github.com-peterbourgon-diskv \
    nativesdk-github.com-syndtr-goleveldb \
"
GO_IMPORT = "github.com/gregjones/httpcache"
inherit gosrc
inherit nativesdk
