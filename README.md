# Kommunity App

[Doc](https://docs.google.com/document/d/1P9znOKfQIHDP3BVS5ptvFgzSLmL0vo4WTAZrcKatFBA)

## Projeyi kendi bilgisayarinda kurma

- **Clone or download** butonuna tikla ve linki kopyala
- Terminaline **git clone {your link}** seklinde yaz
- Daha sonra **cd kommunity-frontend** yaz
- Son olarak **npm install** yada **yarn**

## Projeyi kendi bilgisayarinda calistirma

- [Bu](https://github.com/Kommunity-app/kommunity-backend) adresten projenin backendini indir ve calistir
- makinene indirdigin kommunity-frontend pojesine git ve **npm start** yada **yarn start** komutunu calistir
- Tarayicidan **[localhost:3000](http://localhost:3000/)** adresine git

## Projede kullanilan npm komutlari hakkinda bilgi

- `"build" : projeyi yayinlayacakken kullan`

- `"tailwindcss" : projeyi yayinlayacakken kullan`

- `"start" : projeyi yayinlayacakken kullan`

- `"start:prod" : projeyi yayinlayacakken kullan`

- `"check-if-not-committed" : projeyi yayinlayacakken kullan`

- `"check-travis" : projeyi yayinlayacakken kullan`

- `"test" : projeyi yayinlayacakken kullan`

- `"cover" : projeyi yayinlayacakken kullan`

- `"lint" : projeyi yayinlayacakken kullan`

- `"lint-fix" : projeyi yayinlayacakken kullan`

## Yapilan degisiklikten sonra PR olusturma

- Bu adima baslamadan once [buradan](#github-command-docs) bu adimda kullanilacak komutlarin detayli bilgisini bulabilirsin burada sadece nasil kullanacagin yazacak

- (**github ui**) Projeden bir **Fork** olusturun dosyalari kendi forkunuza gondermeniz gerek
- (**terminal**) Kendi branchini olusturmak icin **git checkout -b {your branch name}**
- (**terminal**) Degisiklikleri kaydettikten sonra -- **git add .** -- komutunu yaz
- (**terminal**) Staging area daki dosyaliri branch e gondermek icin -- **git commit -m "your commit message"** -- komutunu yaz
- (**terminal**) Projeyi githuba gondermek icin -- **git push -u {your fork link} {your branch name}** -- komutunu yaz
- (**github ui**) Daha sonra bir **Pul Request** olustur projenin lint ve unit testleri yapildiktan sonra review edilecek hersey dogruysa proje dev branchine merge edilecek

## Kullanilan Teknolojiler

- [nodejs](#nodejs)
- [react](#react)
- [razzle](#razzle)
- [axios](#axios)
- [prop types](#prop-types)
- [react router](#react-router)
- [redux](#redux)
- [styled components](#styled-components)
- [eslint](#eslint)
- [enzyme](#enzyme)
- [jest](#jest)
- [tailwind css](#tailwind-css)
- [github](https://lab.github.com/)
- [babel](#babel)

## Nodejs

[Doc](https://nodejs.org/en/docs/)

## React

[Doc](https://reactjs.org/docs/getting-started.html)

## Razzle

[Doc](https://github.com/jaredpalmer/razzle#quick-start)

## Axios

[Doc](https://github.com/axios/axios#axios)

## Prop Types

[Doc](https://github.com/jaredpalmer/razzle#quick-start)

## React Router

[Doc](https://reacttraining.com/react-router/web/guides/quick-start)

## Redux

[Doc](https://redux.js.org/)

## Styled Components

[Doc](https://www.styled-components.com/docs)

## Eslint

[Doc](https://eslint.org/docs/user-guide/getting-started)

## Enzyme

[Doc](https://github.com/airbnb/enzyme#enzyme)

## Jest

[Doc](https://jestjs.io/docs/en/getting-started)

## Tailwind CSS

[Doc](https://tailwindcss.com/docs/what-is-tailwind/)

## Babel

[Doc](https://babeljs.io/docs/en/)
