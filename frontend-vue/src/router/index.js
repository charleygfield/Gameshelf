import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/game',
    name: 'Game',
    component: () =>
    import ('../views/Game.vue')
  },
  {
    path: '/person',
    name: 'People',
    component: () => import( '../views/Person.vue')
  },
   {
    path: '/addperson',
    name: 'AddPeople',
    component: () => import( '../views/AddPerson.vue')
  },
 {
    path: '/addgame',
    name: 'AddGame',
    component: () => import( '../views/AddGame.vue')
  },
   {
    path: '/gamenight',
    name: 'Gamenight',
    component: () => import( '../views/Gamenight.vue')
  },
]

const router = new VueRouter({
  routes
})

export default router
