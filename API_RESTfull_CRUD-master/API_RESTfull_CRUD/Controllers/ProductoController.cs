using API_RESTfull_CRUD.Contexts;
using API_RESTfull_CRUD.Entities;
using Microsoft.AspNetCore.Mvc;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace API_RESTfull_CRUD.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProductosController : ControllerBase
    {
        private readonly AppDbContext context;

        public ProductosController(AppDbContext context)
        {
            this.context = context;
        }
        // GET: api/<ProductosController>
        [HttpGet]
        public IEnumerable<Producto> Get()
        {
            return context.Producto.ToList();
        }

        // GET api/<ProductosController>/5
        [HttpGet("{id}")]
        public Producto Get(String id)
        {
            var Producto = context.Producto.FirstOrDefault(p => p.pro_codigo == id);
            return Producto;
        }

        // POST api/<ProductosController>
        [HttpPost]
        public void Post([FromBody] string value)
        {
        }

        // PUT api/<ProductosController>/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/<ProductosController>/5
        [HttpDelete("{id}")]
        public void Delete(int id)
        {
        }
    }
}