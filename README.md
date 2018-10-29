# Kommunity App
 
Proje gereksinim dokumani: [gdoc](https://docs.google.com/document/d/1P9znOKfQIHDP3BVS5ptvFgzSLmL0vo4WTAZrcKatFBA)

Server: node.js **"8.11.4"** (eger node versiyonunuzu degistirmek istiyorsaniz bakiniz [nvm](https://github.com/creationix/nvm#node-version-manager---) or [nvs](https://github.com/jasongin/nvs#nvs-node-version-switcher)) <br/>
Client: react.js <br/>

## Misyonumuz
buraya misyon eklenecek

## Projeyi kendi bilgisayarinda kurma

- `Clone or download` butonuna tikla ve linki kopyala
- Terminaline `git clone {your link}` seklinde yaz
- Daha sonra `cd kommunity-frontend` yaz
- Son olarak `npm install` yada `yarn`

## Projeyi kendi bilgisayarinda calistirma

- [Bu](https://github.com/Kommunity-app/kommunity-backend) adresten projenin backendini indir ve calistir
- makinene indirdigin kommunity-frontend pojesine git ve **npm start** yada **yarn start** komutunu calistir
- Tarayicidan **[localhost:3000](http://localhost:3000/)** adresine git

## Projede kullanilan npm komutlari hakkinda bilgi

NPM komutu calistirma: `npm run KOMUT` yada `yarn KOMUT`

Mevcut komutlar:

- `"build"`: projeyi yayinlayacakken kullan

- `"tailwindcss"`: projeyi yayinlayacakken kullan

- `"start"`: projeyi yayinlayacakken kullan

- `"start:prod"`: projeyi yayinlayacakken kullan

- `"check-if-not-committed"`: projeyi yayinlayacakken kullan

- `"check-travis"`: projeyi yayinlayacakken kullan

- `"test"`: projeyi yayinlayacakken kullan

- `"cover"`: projeyi yayinlayacakken kullan

- `"lint"`: projeyi yayinlayacakken kullan

- `"lint-fix"`: projeyi yayinlayacakken kullan

## Yapilan degisiklikten sonra PR olusturma

- Bu adima baslamadan once [buradan](#github-command-docs) bu adimda kullanilacak komutlarin detayli bilgisini bulabilirsin burada sadece nasil kullanacagin yazacak

- (**github ui**) Projeden bir [Fork](https://github.com/Kommunity-app/kommunity-frontend/fork) olusturun dosyalari kendi forkunuza gondermeniz gerek
- (**terminal**) Kendi branchini olusturmak icin `git checkout -b {your branch name}`
- (**terminal**) Degisiklikleri kaydettikten sonra `git add .` komutunu yaz
- (**terminal**) Staging area daki dosyaliri branch e gondermek icin `git commit -m "your commit message"` komutunu yaz
- (**terminal**) Projeyi githuba gondermek icin `git push -u {your fork link} {your branch name}` komutunu yaz
- (**github ui**) Daha sonra yeni bir **Pul Request** olustur projenin lint ve unit testleri yapildiktan sonra review edilecek hersey dogruysa proje dev branchine merge edilecek

## Kullanilan Teknolojiler

- [nodejs](https://nodejs.org/en/docs/){:target="_blank"}
- [react](https://reactjs.org/docs/getting-started.html){:target="_blank"}
- [razzle](https://github.com/jaredpalmer/razzle#quick-start){:target="_blank"}
- [axios](https://github.com/axios/axios#axios){:target="_blank"}
- [react router](https://reacttraining.com/react-router/web/guides/quick-start){:target="_blank"}
- [redux](https://redux.js.org/){:target="_blank"}
- [eslint](https://eslint.org/docs/user-guide/getting-started){:target="_blank"}
- [enzyme](https://github.com/airbnb/enzyme#enzyme){:target="_blank"}
- [jest](https://jestjs.io/docs/en/getting-started){:target="_blank"}
- [tailwind css](https://tailwindcss.com/docs/what-is-tailwind/){:target="_blank"}
- [babel](https://babeljs.io/docs/en/){:target="_blank"}


