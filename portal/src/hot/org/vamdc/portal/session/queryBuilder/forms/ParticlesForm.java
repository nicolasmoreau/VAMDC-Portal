package org.vamdc.portal.session.queryBuilder.forms;

import java.util.ArrayList;
import java.util.Collection;

import org.vamdc.dictionary.Restrictable;
import org.vamdc.portal.session.queryBuilder.QueryData;
import org.vamdc.portal.session.queryBuilder.fields.AbstractField;
import org.vamdc.portal.session.queryBuilder.fields.SuggestionField;
import org.vamdc.portal.session.queryBuilder.fields.SuggestionImpl;

public class ParticlesForm extends AbstractForm implements Form{

	public String getTitle() { return "Particles"; }
	public Integer getOrder() { return Order.Particles; }
	public String getView() { return "/xhtml/query/forms/standardForm.xhtml"; }
	
	public ParticlesForm(QueryData queryData){
		super(queryData);
		fields = new ArrayList<AbstractField>();
		fields.add(
				new SuggestionField(Restrictable.ParticleName,"Particle name",new ParticleNameSuggest()));
	}
	
	public class ParticleNameSuggest extends SuggestionImpl{

		@Override
		protected Collection<String> getValues() {
			Collection<String> result = new ArrayList<String>(){
				private static final long serialVersionUID = -7876192603503355123L;
			{
				add("photon");
				add("electron");
				add("muon");
				add("positron");
				add("neutron");
				add("alpha");
			    add("cosmic");
			}};
			return result;
		}

		@Override
		public void selected() {
		}
	}
	
}
