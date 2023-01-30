import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import About from "../views/About.vue";
import adminEbook from "@/views/admin/admin-ebook.vue";
import adminCategory from "@/views/admin/admin-category.vue";
import AdminDoc from '../views/admin/admin-doc.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component:About
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
  },
  {
    path:'/ebook',
    name:'admin-ebook',
    component:adminEbook
  },
  {
    path:'/admin/category',
    name:'AdminCategory',
    component:adminCategory
  },
  {
      path: '/admin/doc',
        name: 'AdminDoc',
        component: AdminDoc
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
