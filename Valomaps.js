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

// substituir por uma chamada à API ou dados estáticos
const mapsData = [
    { name: "Bind", imageUrl: "img/bind.webp", info: "Descrição de Bind." },
    { name: "Haven", imageUrl: "img/haven-valorant.jpg", info: "Descrição de Haven." },
    { name: "Split", imageUrl: "img/split-valorant.jpg", info: "Descrição de Split." },
    { name: "Ascent", imageUrl: "img/ascent-valorant.jpg", info: "Descrição de Ascent." },
  ];
  
  // Função para criar os cards dos mapas
  function createMapCards() {
    const container = document.getElementById("maps-container");
  
    mapsData.forEach(map => {
      const card = document.createElement("div");
      card.classList.add("card");
      card.innerHTML = `<img src="${map.imageUrl}" alt="${map.name}">`;
      card.addEventListener("click", () => displayMapInfo(map));
      container.appendChild(card);
    });
  }
  
  // Função para exibir informações do mapa ao clicar no card
  function displayMapInfo(map) {
    const modal = document.getElementById("map-info-modal");
    const modalContent = document.getElementById("map-info");
    const closeModal = document.querySelector(".close");
  
    modalContent.innerHTML = `<h2>${map.name}</h2><p>${map.info}</p>`;
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
  window.onload = createMapCards;
  