import co.uk.deniswindsor.Rot13

request.setAttribute 'contentTitle', 'Unit 2 Rot 13'
request.setAttribute 'contentBodyId', 'www-deniswindsor-co-uk-udacity-hm2-rot13'

request.setAttribute 'formText', new Rot13().encrypt(params['text'])

forward '/WEB-INF/templates/udacity/rot13.html'