import React, {Component} from 'react';
import axios from 'axios';
import Recipe from './Recipe';

class RecipeList extends Component{
	state = {
		recipes: [],
	}

	componentDidMount(){
		axios.get("/recipes/recipes")
		.then((response) => {
			this.setState({recipes: response.data});
		}).catch((error) => {
			console.log("Error getting recipes");
			console.log(error);
		});
	}

	render(){
		const recipeComponents = this.state.recipes.map((recipe, index) => {
			return <Recipe index={index} title={recipe.title} description={recipe.description} />
		})
		return(
			<div>
				<h2>Recipe List</h2>
				{recipeComponents}
			</div>
		);
	}
}

export default RecipeList;