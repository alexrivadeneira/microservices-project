import React, {Component} from 'react';

class Recipe extends Component{

	render(){
		return(
			<div>
				<h4>{this.props.title}</h4>
				<pre>{this.props.description}</pre>
			</div>
		);
	}
}

export default Recipe;