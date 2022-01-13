SUMMARY = "go.mod: github.com/gobuffalo/pop/v5"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/pop/v5"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-pop-v5-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-fatih-color \
    nativesdk-github.com-go-sql-driver-mysql \
    nativesdk-github.com-gobuffalo-attrs \
    nativesdk-github.com-gobuffalo-envy \
    nativesdk-github.com-gobuffalo-fizz \
    nativesdk-github.com-gobuffalo-flect \
    nativesdk-github.com-gobuffalo-genny-v2 \
    nativesdk-github.com-gobuffalo-logger \
    nativesdk-github.com-gobuffalo-nulls \
    nativesdk-github.com-gobuffalo-packd \
    nativesdk-github.com-gobuffalo-packr-v2 \
    nativesdk-github.com-gobuffalo-plush-v4 \
    nativesdk-github.com-gobuffalo-validate-v3 \
    nativesdk-github.com-gofrs-uuid \
    nativesdk-github.com-jackc-pgconn \
    nativesdk-github.com-jackc-pgx-v4 \
    nativesdk-github.com-jmoiron-sqlx \
    nativesdk-github.com-lib-pq \
    nativesdk-github.com-luna-duclos-instrumentedsql \
    nativesdk-github.com-mattn-go-sqlite3 \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-spf13-cobra \
    nativesdk-golang.org-x-sync \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/gobuffalo/pop/v5"
inherit gosrc
inherit nativesdk
