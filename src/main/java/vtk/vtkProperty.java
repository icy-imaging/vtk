// java wrapper for vtkProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProperty extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void DeepCopy_4(vtkProperty id0);
  public void DeepCopy(vtkProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native void Render_5(vtkActor id0,vtkRenderer id1);
  public void Render(vtkActor id0,vtkRenderer id1)
  {
    Render_5(id0,id1);
  }

  private native void BackfaceRender_6(vtkActor id0,vtkRenderer id1);
  public void BackfaceRender(vtkActor id0,vtkRenderer id1)
  {
    BackfaceRender_6(id0,id1);
  }

  private native void PostRender_7(vtkActor id0,vtkRenderer id1);
  public void PostRender(vtkActor id0,vtkRenderer id1)
  {
    PostRender_7(id0,id1);
  }

  private native boolean GetLighting_8();
  public boolean GetLighting()
  {
    return GetLighting_8();
  }

  private native void SetLighting_9(boolean id0);
  public void SetLighting(boolean id0)
  {
    SetLighting_9(id0);
  }

  private native void LightingOn_10();
  public void LightingOn()
  {
    LightingOn_10();
  }

  private native void LightingOff_11();
  public void LightingOff()
  {
    LightingOff_11();
  }

  private native boolean GetRenderPointsAsSpheres_12();
  public boolean GetRenderPointsAsSpheres()
  {
    return GetRenderPointsAsSpheres_12();
  }

  private native void SetRenderPointsAsSpheres_13(boolean id0);
  public void SetRenderPointsAsSpheres(boolean id0)
  {
    SetRenderPointsAsSpheres_13(id0);
  }

  private native void RenderPointsAsSpheresOn_14();
  public void RenderPointsAsSpheresOn()
  {
    RenderPointsAsSpheresOn_14();
  }

  private native void RenderPointsAsSpheresOff_15();
  public void RenderPointsAsSpheresOff()
  {
    RenderPointsAsSpheresOff_15();
  }

  private native boolean GetRenderLinesAsTubes_16();
  public boolean GetRenderLinesAsTubes()
  {
    return GetRenderLinesAsTubes_16();
  }

  private native void SetRenderLinesAsTubes_17(boolean id0);
  public void SetRenderLinesAsTubes(boolean id0)
  {
    SetRenderLinesAsTubes_17(id0);
  }

  private native void RenderLinesAsTubesOn_18();
  public void RenderLinesAsTubesOn()
  {
    RenderLinesAsTubesOn_18();
  }

  private native void RenderLinesAsTubesOff_19();
  public void RenderLinesAsTubesOff()
  {
    RenderLinesAsTubesOff_19();
  }

  private native void SetInterpolation_20(int id0);
  public void SetInterpolation(int id0)
  {
    SetInterpolation_20(id0);
  }

  private native int GetInterpolationMinValue_21();
  public int GetInterpolationMinValue()
  {
    return GetInterpolationMinValue_21();
  }

  private native int GetInterpolationMaxValue_22();
  public int GetInterpolationMaxValue()
  {
    return GetInterpolationMaxValue_22();
  }

  private native int GetInterpolation_23();
  public int GetInterpolation()
  {
    return GetInterpolation_23();
  }

  private native void SetInterpolationToFlat_24();
  public void SetInterpolationToFlat()
  {
    SetInterpolationToFlat_24();
  }

  private native void SetInterpolationToGouraud_25();
  public void SetInterpolationToGouraud()
  {
    SetInterpolationToGouraud_25();
  }

  private native void SetInterpolationToPhong_26();
  public void SetInterpolationToPhong()
  {
    SetInterpolationToPhong_26();
  }

  private native void SetInterpolationToPBR_27();
  public void SetInterpolationToPBR()
  {
    SetInterpolationToPBR_27();
  }

  private native byte[] GetInterpolationAsString_28();
  public String GetInterpolationAsString()
  {
    return new String(GetInterpolationAsString_28(), StandardCharsets.UTF_8);
  }

  private native void SetRepresentation_29(int id0);
  public void SetRepresentation(int id0)
  {
    SetRepresentation_29(id0);
  }

  private native int GetRepresentationMinValue_30();
  public int GetRepresentationMinValue()
  {
    return GetRepresentationMinValue_30();
  }

  private native int GetRepresentationMaxValue_31();
  public int GetRepresentationMaxValue()
  {
    return GetRepresentationMaxValue_31();
  }

  private native int GetRepresentation_32();
  public int GetRepresentation()
  {
    return GetRepresentation_32();
  }

  private native void SetRepresentationToPoints_33();
  public void SetRepresentationToPoints()
  {
    SetRepresentationToPoints_33();
  }

  private native void SetRepresentationToWireframe_34();
  public void SetRepresentationToWireframe()
  {
    SetRepresentationToWireframe_34();
  }

  private native void SetRepresentationToSurface_35();
  public void SetRepresentationToSurface()
  {
    SetRepresentationToSurface_35();
  }

  private native byte[] GetRepresentationAsString_36();
  public String GetRepresentationAsString()
  {
    return new String(GetRepresentationAsString_36(), StandardCharsets.UTF_8);
  }

  private native void SetColor_37(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_37(id0,id1,id2);
  }

  private native void SetColor_38(double id0[]);
  public void SetColor(double id0[])
  {
    SetColor_38(id0);
  }

  private native double[] GetColor_39();
  public double[] GetColor()
  {
    return GetColor_39();
  }

  private native void GetColor_40(double id0[]);
  public void GetColor(double id0[])
  {
    GetColor_40(id0);
  }

  private native void SetBaseIOR_41(double id0);
  public void SetBaseIOR(double id0)
  {
    SetBaseIOR_41(id0);
  }

  private native double GetBaseIORMinValue_42();
  public double GetBaseIORMinValue()
  {
    return GetBaseIORMinValue_42();
  }

  private native double GetBaseIORMaxValue_43();
  public double GetBaseIORMaxValue()
  {
    return GetBaseIORMaxValue_43();
  }

  private native double GetBaseIOR_44();
  public double GetBaseIOR()
  {
    return GetBaseIOR_44();
  }

  private native void SetMetallic_45(double id0);
  public void SetMetallic(double id0)
  {
    SetMetallic_45(id0);
  }

  private native double GetMetallicMinValue_46();
  public double GetMetallicMinValue()
  {
    return GetMetallicMinValue_46();
  }

  private native double GetMetallicMaxValue_47();
  public double GetMetallicMaxValue()
  {
    return GetMetallicMaxValue_47();
  }

  private native double GetMetallic_48();
  public double GetMetallic()
  {
    return GetMetallic_48();
  }

  private native void SetRoughness_49(double id0);
  public void SetRoughness(double id0)
  {
    SetRoughness_49(id0);
  }

  private native double GetRoughnessMinValue_50();
  public double GetRoughnessMinValue()
  {
    return GetRoughnessMinValue_50();
  }

  private native double GetRoughnessMaxValue_51();
  public double GetRoughnessMaxValue()
  {
    return GetRoughnessMaxValue_51();
  }

  private native double GetRoughness_52();
  public double GetRoughness()
  {
    return GetRoughness_52();
  }

  private native void SetAnisotropy_53(double id0);
  public void SetAnisotropy(double id0)
  {
    SetAnisotropy_53(id0);
  }

  private native double GetAnisotropyMinValue_54();
  public double GetAnisotropyMinValue()
  {
    return GetAnisotropyMinValue_54();
  }

  private native double GetAnisotropyMaxValue_55();
  public double GetAnisotropyMaxValue()
  {
    return GetAnisotropyMaxValue_55();
  }

  private native double GetAnisotropy_56();
  public double GetAnisotropy()
  {
    return GetAnisotropy_56();
  }

  private native void SetAnisotropyRotation_57(double id0);
  public void SetAnisotropyRotation(double id0)
  {
    SetAnisotropyRotation_57(id0);
  }

  private native double GetAnisotropyRotationMinValue_58();
  public double GetAnisotropyRotationMinValue()
  {
    return GetAnisotropyRotationMinValue_58();
  }

  private native double GetAnisotropyRotationMaxValue_59();
  public double GetAnisotropyRotationMaxValue()
  {
    return GetAnisotropyRotationMaxValue_59();
  }

  private native double GetAnisotropyRotation_60();
  public double GetAnisotropyRotation()
  {
    return GetAnisotropyRotation_60();
  }

  private native void SetCoatIOR_61(double id0);
  public void SetCoatIOR(double id0)
  {
    SetCoatIOR_61(id0);
  }

  private native double GetCoatIORMinValue_62();
  public double GetCoatIORMinValue()
  {
    return GetCoatIORMinValue_62();
  }

  private native double GetCoatIORMaxValue_63();
  public double GetCoatIORMaxValue()
  {
    return GetCoatIORMaxValue_63();
  }

  private native double GetCoatIOR_64();
  public double GetCoatIOR()
  {
    return GetCoatIOR_64();
  }

  private native void SetCoatRoughness_65(double id0);
  public void SetCoatRoughness(double id0)
  {
    SetCoatRoughness_65(id0);
  }

  private native double GetCoatRoughnessMinValue_66();
  public double GetCoatRoughnessMinValue()
  {
    return GetCoatRoughnessMinValue_66();
  }

  private native double GetCoatRoughnessMaxValue_67();
  public double GetCoatRoughnessMaxValue()
  {
    return GetCoatRoughnessMaxValue_67();
  }

  private native double GetCoatRoughness_68();
  public double GetCoatRoughness()
  {
    return GetCoatRoughness_68();
  }

  private native void SetCoatStrength_69(double id0);
  public void SetCoatStrength(double id0)
  {
    SetCoatStrength_69(id0);
  }

  private native double GetCoatStrengthMinValue_70();
  public double GetCoatStrengthMinValue()
  {
    return GetCoatStrengthMinValue_70();
  }

  private native double GetCoatStrengthMaxValue_71();
  public double GetCoatStrengthMaxValue()
  {
    return GetCoatStrengthMaxValue_71();
  }

  private native double GetCoatStrength_72();
  public double GetCoatStrength()
  {
    return GetCoatStrength_72();
  }

  private native void SetCoatColor_73(double id0,double id1,double id2);
  public void SetCoatColor(double id0,double id1,double id2)
  {
    SetCoatColor_73(id0,id1,id2);
  }

  private native void SetCoatColor_74(double id0[]);
  public void SetCoatColor(double id0[])
  {
    SetCoatColor_74(id0);
  }

  private native double[] GetCoatColor_75();
  public double[] GetCoatColor()
  {
    return GetCoatColor_75();
  }

  private native void SetCoatNormalScale_76(double id0);
  public void SetCoatNormalScale(double id0)
  {
    SetCoatNormalScale_76(id0);
  }

  private native double GetCoatNormalScaleMinValue_77();
  public double GetCoatNormalScaleMinValue()
  {
    return GetCoatNormalScaleMinValue_77();
  }

  private native double GetCoatNormalScaleMaxValue_78();
  public double GetCoatNormalScaleMaxValue()
  {
    return GetCoatNormalScaleMaxValue_78();
  }

  private native double GetCoatNormalScale_79();
  public double GetCoatNormalScale()
  {
    return GetCoatNormalScale_79();
  }

  private native void SetNormalScale_80(double id0);
  public void SetNormalScale(double id0)
  {
    SetNormalScale_80(id0);
  }

  private native double GetNormalScale_81();
  public double GetNormalScale()
  {
    return GetNormalScale_81();
  }

  private native void SetOcclusionStrength_82(double id0);
  public void SetOcclusionStrength(double id0)
  {
    SetOcclusionStrength_82(id0);
  }

  private native double GetOcclusionStrengthMinValue_83();
  public double GetOcclusionStrengthMinValue()
  {
    return GetOcclusionStrengthMinValue_83();
  }

  private native double GetOcclusionStrengthMaxValue_84();
  public double GetOcclusionStrengthMaxValue()
  {
    return GetOcclusionStrengthMaxValue_84();
  }

  private native double GetOcclusionStrength_85();
  public double GetOcclusionStrength()
  {
    return GetOcclusionStrength_85();
  }

  private native void SetEmissiveFactor_86(double id0,double id1,double id2);
  public void SetEmissiveFactor(double id0,double id1,double id2)
  {
    SetEmissiveFactor_86(id0,id1,id2);
  }

  private native void SetEmissiveFactor_87(double id0[]);
  public void SetEmissiveFactor(double id0[])
  {
    SetEmissiveFactor_87(id0);
  }

  private native double[] GetEmissiveFactor_88();
  public double[] GetEmissiveFactor()
  {
    return GetEmissiveFactor_88();
  }

  private native void SetEdgeTint_89(double id0,double id1,double id2);
  public void SetEdgeTint(double id0,double id1,double id2)
  {
    SetEdgeTint_89(id0,id1,id2);
  }

  private native void SetEdgeTint_90(double id0[]);
  public void SetEdgeTint(double id0[])
  {
    SetEdgeTint_90(id0);
  }

  private native double[] GetEdgeTint_91();
  public double[] GetEdgeTint()
  {
    return GetEdgeTint_91();
  }

  private native void SetAmbient_92(double id0);
  public void SetAmbient(double id0)
  {
    SetAmbient_92(id0);
  }

  private native double GetAmbientMinValue_93();
  public double GetAmbientMinValue()
  {
    return GetAmbientMinValue_93();
  }

  private native double GetAmbientMaxValue_94();
  public double GetAmbientMaxValue()
  {
    return GetAmbientMaxValue_94();
  }

  private native double GetAmbient_95();
  public double GetAmbient()
  {
    return GetAmbient_95();
  }

  private native void SetDiffuse_96(double id0);
  public void SetDiffuse(double id0)
  {
    SetDiffuse_96(id0);
  }

  private native double GetDiffuseMinValue_97();
  public double GetDiffuseMinValue()
  {
    return GetDiffuseMinValue_97();
  }

  private native double GetDiffuseMaxValue_98();
  public double GetDiffuseMaxValue()
  {
    return GetDiffuseMaxValue_98();
  }

  private native double GetDiffuse_99();
  public double GetDiffuse()
  {
    return GetDiffuse_99();
  }

  private native void SetSpecular_100(double id0);
  public void SetSpecular(double id0)
  {
    SetSpecular_100(id0);
  }

  private native double GetSpecularMinValue_101();
  public double GetSpecularMinValue()
  {
    return GetSpecularMinValue_101();
  }

  private native double GetSpecularMaxValue_102();
  public double GetSpecularMaxValue()
  {
    return GetSpecularMaxValue_102();
  }

  private native double GetSpecular_103();
  public double GetSpecular()
  {
    return GetSpecular_103();
  }

  private native void SetSpecularPower_104(double id0);
  public void SetSpecularPower(double id0)
  {
    SetSpecularPower_104(id0);
  }

  private native double GetSpecularPowerMinValue_105();
  public double GetSpecularPowerMinValue()
  {
    return GetSpecularPowerMinValue_105();
  }

  private native double GetSpecularPowerMaxValue_106();
  public double GetSpecularPowerMaxValue()
  {
    return GetSpecularPowerMaxValue_106();
  }

  private native double GetSpecularPower_107();
  public double GetSpecularPower()
  {
    return GetSpecularPower_107();
  }

  private native void SetOpacity_108(double id0);
  public void SetOpacity(double id0)
  {
    SetOpacity_108(id0);
  }

  private native double GetOpacityMinValue_109();
  public double GetOpacityMinValue()
  {
    return GetOpacityMinValue_109();
  }

  private native double GetOpacityMaxValue_110();
  public double GetOpacityMaxValue()
  {
    return GetOpacityMaxValue_110();
  }

  private native double GetOpacity_111();
  public double GetOpacity()
  {
    return GetOpacity_111();
  }

  private native void SetEdgeOpacity_112(double id0);
  public void SetEdgeOpacity(double id0)
  {
    SetEdgeOpacity_112(id0);
  }

  private native double GetEdgeOpacityMinValue_113();
  public double GetEdgeOpacityMinValue()
  {
    return GetEdgeOpacityMinValue_113();
  }

  private native double GetEdgeOpacityMaxValue_114();
  public double GetEdgeOpacityMaxValue()
  {
    return GetEdgeOpacityMaxValue_114();
  }

  private native double GetEdgeOpacity_115();
  public double GetEdgeOpacity()
  {
    return GetEdgeOpacity_115();
  }

  private native void SetAmbientColor_116(double id0,double id1,double id2);
  public void SetAmbientColor(double id0,double id1,double id2)
  {
    SetAmbientColor_116(id0,id1,id2);
  }

  private native void SetAmbientColor_117(double id0[]);
  public void SetAmbientColor(double id0[])
  {
    SetAmbientColor_117(id0);
  }

  private native double[] GetAmbientColor_118();
  public double[] GetAmbientColor()
  {
    return GetAmbientColor_118();
  }

  private native void SetDiffuseColor_119(double id0,double id1,double id2);
  public void SetDiffuseColor(double id0,double id1,double id2)
  {
    SetDiffuseColor_119(id0,id1,id2);
  }

  private native void SetDiffuseColor_120(double id0[]);
  public void SetDiffuseColor(double id0[])
  {
    SetDiffuseColor_120(id0);
  }

  private native double[] GetDiffuseColor_121();
  public double[] GetDiffuseColor()
  {
    return GetDiffuseColor_121();
  }

  private native void SetSpecularColor_122(double id0,double id1,double id2);
  public void SetSpecularColor(double id0,double id1,double id2)
  {
    SetSpecularColor_122(id0,id1,id2);
  }

  private native void SetSpecularColor_123(double id0[]);
  public void SetSpecularColor(double id0[])
  {
    SetSpecularColor_123(id0);
  }

  private native double[] GetSpecularColor_124();
  public double[] GetSpecularColor()
  {
    return GetSpecularColor_124();
  }

  private native int GetEdgeVisibility_125();
  public int GetEdgeVisibility()
  {
    return GetEdgeVisibility_125();
  }

  private native void SetEdgeVisibility_126(int id0);
  public void SetEdgeVisibility(int id0)
  {
    SetEdgeVisibility_126(id0);
  }

  private native void EdgeVisibilityOn_127();
  public void EdgeVisibilityOn()
  {
    EdgeVisibilityOn_127();
  }

  private native void EdgeVisibilityOff_128();
  public void EdgeVisibilityOff()
  {
    EdgeVisibilityOff_128();
  }

  private native void SetEdgeColor_129(double id0,double id1,double id2);
  public void SetEdgeColor(double id0,double id1,double id2)
  {
    SetEdgeColor_129(id0,id1,id2);
  }

  private native void SetEdgeColor_130(double id0[]);
  public void SetEdgeColor(double id0[])
  {
    SetEdgeColor_130(id0);
  }

  private native double[] GetEdgeColor_131();
  public double[] GetEdgeColor()
  {
    return GetEdgeColor_131();
  }

  private native int GetVertexVisibility_132();
  public int GetVertexVisibility()
  {
    return GetVertexVisibility_132();
  }

  private native void SetVertexVisibility_133(int id0);
  public void SetVertexVisibility(int id0)
  {
    SetVertexVisibility_133(id0);
  }

  private native void VertexVisibilityOn_134();
  public void VertexVisibilityOn()
  {
    VertexVisibilityOn_134();
  }

  private native void VertexVisibilityOff_135();
  public void VertexVisibilityOff()
  {
    VertexVisibilityOff_135();
  }

  private native void SetVertexColor_136(double id0,double id1,double id2);
  public void SetVertexColor(double id0,double id1,double id2)
  {
    SetVertexColor_136(id0,id1,id2);
  }

  private native void SetVertexColor_137(double id0[]);
  public void SetVertexColor(double id0[])
  {
    SetVertexColor_137(id0);
  }

  private native double[] GetVertexColor_138();
  public double[] GetVertexColor()
  {
    return GetVertexColor_138();
  }

  private native void SetSelectionColor_139(double id0,double id1,double id2,double id3);
  public void SetSelectionColor(double id0,double id1,double id2,double id3)
  {
    SetSelectionColor_139(id0,id1,id2,id3);
  }

  private native void SetSelectionColor_140(double id0[]);
  public void SetSelectionColor(double id0[])
  {
    SetSelectionColor_140(id0);
  }

  private native double[] GetSelectionColor_141();
  public double[] GetSelectionColor()
  {
    return GetSelectionColor_141();
  }

  private native void SetSelectionLineWidth_142(float id0);
  public void SetSelectionLineWidth(float id0)
  {
    SetSelectionLineWidth_142(id0);
  }

  private native float GetSelectionLineWidth_143();
  public float GetSelectionLineWidth()
  {
    return GetSelectionLineWidth_143();
  }

  private native void SetSelectionPointSize_144(float id0);
  public void SetSelectionPointSize(float id0)
  {
    SetSelectionPointSize_144(id0);
  }

  private native float GetSelectionPointSize_145();
  public float GetSelectionPointSize()
  {
    return GetSelectionPointSize_145();
  }

  private native void SetLineWidth_146(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_146(id0);
  }

  private native float GetLineWidthMinValue_147();
  public float GetLineWidthMinValue()
  {
    return GetLineWidthMinValue_147();
  }

  private native float GetLineWidthMaxValue_148();
  public float GetLineWidthMaxValue()
  {
    return GetLineWidthMaxValue_148();
  }

  private native float GetLineWidth_149();
  public float GetLineWidth()
  {
    return GetLineWidth_149();
  }

  private native void SetLineStipplePattern_150(int id0);
  public void SetLineStipplePattern(int id0)
  {
    SetLineStipplePattern_150(id0);
  }

  private native int GetLineStipplePattern_151();
  public int GetLineStipplePattern()
  {
    return GetLineStipplePattern_151();
  }

  private native void SetLineStippleRepeatFactor_152(int id0);
  public void SetLineStippleRepeatFactor(int id0)
  {
    SetLineStippleRepeatFactor_152(id0);
  }

  private native int GetLineStippleRepeatFactorMinValue_153();
  public int GetLineStippleRepeatFactorMinValue()
  {
    return GetLineStippleRepeatFactorMinValue_153();
  }

  private native int GetLineStippleRepeatFactorMaxValue_154();
  public int GetLineStippleRepeatFactorMaxValue()
  {
    return GetLineStippleRepeatFactorMaxValue_154();
  }

  private native int GetLineStippleRepeatFactor_155();
  public int GetLineStippleRepeatFactor()
  {
    return GetLineStippleRepeatFactor_155();
  }

  private native void SetPointSize_156(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_156(id0);
  }

  private native float GetPointSizeMinValue_157();
  public float GetPointSizeMinValue()
  {
    return GetPointSizeMinValue_157();
  }

  private native float GetPointSizeMaxValue_158();
  public float GetPointSizeMaxValue()
  {
    return GetPointSizeMaxValue_158();
  }

  private native float GetPointSize_159();
  public float GetPointSize()
  {
    return GetPointSize_159();
  }

  private native int GetBackfaceCulling_160();
  public int GetBackfaceCulling()
  {
    return GetBackfaceCulling_160();
  }

  private native void SetBackfaceCulling_161(int id0);
  public void SetBackfaceCulling(int id0)
  {
    SetBackfaceCulling_161(id0);
  }

  private native void BackfaceCullingOn_162();
  public void BackfaceCullingOn()
  {
    BackfaceCullingOn_162();
  }

  private native void BackfaceCullingOff_163();
  public void BackfaceCullingOff()
  {
    BackfaceCullingOff_163();
  }

  private native int GetFrontfaceCulling_164();
  public int GetFrontfaceCulling()
  {
    return GetFrontfaceCulling_164();
  }

  private native void SetFrontfaceCulling_165(int id0);
  public void SetFrontfaceCulling(int id0)
  {
    SetFrontfaceCulling_165(id0);
  }

  private native void FrontfaceCullingOn_166();
  public void FrontfaceCullingOn()
  {
    FrontfaceCullingOn_166();
  }

  private native void FrontfaceCullingOff_167();
  public void FrontfaceCullingOff()
  {
    FrontfaceCullingOff_167();
  }

  private native void SetMaterialName_168(byte[] id0, int len0);
  public void SetMaterialName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaterialName_168(bytes0, bytes0.length);
  }

  private native byte[] GetMaterialName_169();
  public String GetMaterialName()
  {
    return new String(GetMaterialName_169(), StandardCharsets.UTF_8);
  }

  private native void SetShading_170(int id0);
  public void SetShading(int id0)
  {
    SetShading_170(id0);
  }

  private native int GetShading_171();
  public int GetShading()
  {
    return GetShading_171();
  }

  private native void ShadingOn_172();
  public void ShadingOn()
  {
    ShadingOn_172();
  }

  private native void ShadingOff_173();
  public void ShadingOff()
  {
    ShadingOff_173();
  }

  private native void AddShaderVariable_174(byte[] id0, int len0,int id1);
  public void AddShaderVariable(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_174(bytes0, bytes0.length,id1);
  }

  private native void AddShaderVariable_175(byte[] id0, int len0,float id1);
  public void AddShaderVariable(String id0,float id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_175(bytes0, bytes0.length,id1);
  }

  private native void AddShaderVariable_176(byte[] id0, int len0,double id1);
  public void AddShaderVariable(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_176(bytes0, bytes0.length,id1);
  }

  private native void AddShaderVariable_177(byte[] id0, int len0,int id1,int id2);
  public void AddShaderVariable(String id0,int id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_177(bytes0, bytes0.length,id1,id2);
  }

  private native void AddShaderVariable_178(byte[] id0, int len0,float id1,float id2);
  public void AddShaderVariable(String id0,float id1,float id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_178(bytes0, bytes0.length,id1,id2);
  }

  private native void AddShaderVariable_179(byte[] id0, int len0,double id1,double id2);
  public void AddShaderVariable(String id0,double id1,double id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_179(bytes0, bytes0.length,id1,id2);
  }

  private native void AddShaderVariable_180(byte[] id0, int len0,int id1,int id2,int id3);
  public void AddShaderVariable(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_180(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void AddShaderVariable_181(byte[] id0, int len0,float id1,float id2,float id3);
  public void AddShaderVariable(String id0,float id1,float id2,float id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_181(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void AddShaderVariable_182(byte[] id0, int len0,double id1,double id2,double id3);
  public void AddShaderVariable(String id0,double id1,double id2,double id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddShaderVariable_182(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetShowTexturesOnBackface_183(boolean id0);
  public void SetShowTexturesOnBackface(boolean id0)
  {
    SetShowTexturesOnBackface_183(id0);
  }

  private native boolean GetShowTexturesOnBackface_184();
  public boolean GetShowTexturesOnBackface()
  {
    return GetShowTexturesOnBackface_184();
  }

  private native void ShowTexturesOnBackfaceOn_185();
  public void ShowTexturesOnBackfaceOn()
  {
    ShowTexturesOnBackfaceOn_185();
  }

  private native void ShowTexturesOnBackfaceOff_186();
  public void ShowTexturesOnBackfaceOff()
  {
    ShowTexturesOnBackfaceOff_186();
  }

  private native void SetTexture_187(byte[] id0, int len0,vtkTexture id1);
  public void SetTexture(String id0,vtkTexture id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTexture_187(bytes0, bytes0.length,id1);
  }

  private native long GetTexture_188(byte[] id0, int len0);
  public vtkTexture GetTexture(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetTexture_188(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBaseColorTexture_189(vtkTexture id0);
  public void SetBaseColorTexture(vtkTexture id0)
  {
    SetBaseColorTexture_189(id0);
  }

  private native void SetORMTexture_190(vtkTexture id0);
  public void SetORMTexture(vtkTexture id0)
  {
    SetORMTexture_190(id0);
  }

  private native void SetAnisotropyTexture_191(vtkTexture id0);
  public void SetAnisotropyTexture(vtkTexture id0)
  {
    SetAnisotropyTexture_191(id0);
  }

  private native void SetNormalTexture_192(vtkTexture id0);
  public void SetNormalTexture(vtkTexture id0)
  {
    SetNormalTexture_192(id0);
  }

  private native void SetEmissiveTexture_193(vtkTexture id0);
  public void SetEmissiveTexture(vtkTexture id0)
  {
    SetEmissiveTexture_193(id0);
  }

  private native void SetCoatNormalTexture_194(vtkTexture id0);
  public void SetCoatNormalTexture(vtkTexture id0)
  {
    SetCoatNormalTexture_194(id0);
  }

  private native void RemoveTexture_195(byte[] id0, int len0);
  public void RemoveTexture(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveTexture_195(bytes0, bytes0.length);
  }

  private native void RemoveAllTextures_196();
  public void RemoveAllTextures()
  {
    RemoveAllTextures_196();
  }

  private native int GetNumberOfTextures_197();
  public int GetNumberOfTextures()
  {
    return GetNumberOfTextures_197();
  }

  private native void ReleaseGraphicsResources_198(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_198(id0);
  }

  private native long GetInformation_199();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_199();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_200(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_200(id0);
  }

  private native double ComputeReflectanceFromIOR_201(double id0,double id1);
  public double ComputeReflectanceFromIOR(double id0,double id1)
  {
    return ComputeReflectanceFromIOR_201(id0,id1);
  }

  private native double ComputeIORFromReflectance_202(double id0,double id1);
  public double ComputeIORFromReflectance(double id0,double id1)
  {
    return ComputeIORFromReflectance_202(id0,id1);
  }

  private native double ComputeReflectanceOfBaseLayer_203();
  public double ComputeReflectanceOfBaseLayer()
  {
    return ComputeReflectanceOfBaseLayer_203();
  }

  public vtkProperty() { super(); }

  public vtkProperty(long id) { super(id); }
  public native long   VTKInit();

}
