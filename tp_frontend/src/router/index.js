import Vue from 'vue'
import Router from 'vue-router'
import boardList from '@/components/board/boardList.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/board',
      name: 'boardList',
      component: boardList
    }
  ]
})
