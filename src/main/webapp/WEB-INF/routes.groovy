all "/index", forward: "/index.groovy"
all "/index.html", forward: "/index.groovy"

all "/hello", forward: "hello_udacity.groovy"

all "/disclaimer", forward: "/disclaimer.groovy"
all "/disclaimer.html", forward: "/disclaimer.groovy"

// routes for the blobstore service example
get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"

get "/favicon.ico", redirect: "/images/dw_32.png"