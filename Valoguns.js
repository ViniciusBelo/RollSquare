var menuItem = document.querySelectorAll('.item-menu')

function selectLink(){
    menuItem.forEach((item)=>
        item.classList.remove('ativo')
    )
    this.classList.add('ativo')
}

menuItem.forEach((item)=>
    item.addEventListener('click', selectLink)
)

//Expandir o menu lateral

var btnExp = document.querySelector('#btn-exp')
var menuSide = document.querySelector('.menu-lateral')

btnExp.addEventListener('click', function(){
    menuSide.classList.toggle('expandir')
})
 
 // substituir por uma chamada à API
  const gunsData = [
    { name: "Vandal", imageUrl: "img/Vandal-Valorant-weapon-guide-title-card-aspect-ratio-2-1.png", info: "Descrição da Vandal." },
    { name: "Phantom", imageUrl: "img/phantom-valorant.jpg", info: "Descrição da Phantom." },
    { name: "Operator", imageUrl: "img/operator-valorant.jpg", info: "Descrição da Operator." },
    { name: "Sheriff", imageUrl: "img/sheriff-valorant.jpg", info: "Descrição da Sheriff." },
    { name: "Ares", imageUrl: "img/ares-valorant.jpg", info: "Descrição da Ares." },
  ];
  
  // Função para criar os cards das armas
  function createGunCards() {
    const container = document.getElementById("guns-container");
  
    gunsData.forEach(gun => {
      const card = document.createElement("div");
      card.classList.add("card");
      card.innerHTML = `<img src="${gun.imageUrl}" alt="${gun.name}">`;
      card.addEventListener("click", () => displayGunInfo(gun));
      container.appendChild(card);
    });
  }
  
  // Função para exibir informações da arma ao clicar no card
  function displayGunInfo(gun) {
    const modal = document.getElementById("gun-info-modal");
    const modalContent = document.getElementById("gun-info");
    const closeModal = document.querySelector(".close");
  
    modalContent.innerHTML = `<h2>${gun.name}</h2><p>${gun.info}</p>`;
    modal.style.display = "block";
  
    closeModal.addEventListener("click", () => {
      modal.style.display = "none";
    });
  
    window.addEventListener("click", (event) => {
      if (event.target == modal) {
        modal.style.display = "none";
      }
    });
  }
  
  // Inicializa a criação dos cards ao carregar a página
  window.onload = createGunCards;
    