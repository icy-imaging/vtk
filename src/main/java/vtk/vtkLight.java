// java wrapper for vtkLight object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLight extends vtkObject
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

  private native long ShallowClone_4();
  public vtkLight ShallowClone()
  {
    long temp = ShallowClone_4();

    if (temp == 0) return null;
    return (vtkLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Render_5(vtkRenderer id0,int id1);
  public void Render(vtkRenderer id0,int id1)
  {
    Render_5(id0,id1);
  }

  private native void SetAmbientColor_6(double id0,double id1,double id2);
  public void SetAmbientColor(double id0,double id1,double id2)
  {
    SetAmbientColor_6(id0,id1,id2);
  }

  private native void SetAmbientColor_7(double id0[]);
  public void SetAmbientColor(double id0[])
  {
    SetAmbientColor_7(id0);
  }

  private native double[] GetAmbientColor_8();
  public double[] GetAmbientColor()
  {
    return GetAmbientColor_8();
  }

  private native void SetDiffuseColor_9(double id0,double id1,double id2);
  public void SetDiffuseColor(double id0,double id1,double id2)
  {
    SetDiffuseColor_9(id0,id1,id2);
  }

  private native void SetDiffuseColor_10(double id0[]);
  public void SetDiffuseColor(double id0[])
  {
    SetDiffuseColor_10(id0);
  }

  private native double[] GetDiffuseColor_11();
  public double[] GetDiffuseColor()
  {
    return GetDiffuseColor_11();
  }

  private native void SetSpecularColor_12(double id0,double id1,double id2);
  public void SetSpecularColor(double id0,double id1,double id2)
  {
    SetSpecularColor_12(id0,id1,id2);
  }

  private native void SetSpecularColor_13(double id0[]);
  public void SetSpecularColor(double id0[])
  {
    SetSpecularColor_13(id0);
  }

  private native double[] GetSpecularColor_14();
  public double[] GetSpecularColor()
  {
    return GetSpecularColor_14();
  }

  private native void SetColor_15(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_15(id0,id1,id2);
  }

  private native void SetColor_16(double id0[]);
  public void SetColor(double id0[])
  {
    SetColor_16(id0);
  }

  private native void SetPosition_17(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_17(id0,id1,id2);
  }

  private native void SetPosition_18(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_18(id0);
  }

  private native double[] GetPosition_19();
  public double[] GetPosition()
  {
    return GetPosition_19();
  }

  private native void SetFocalPoint_20(double id0,double id1,double id2);
  public void SetFocalPoint(double id0,double id1,double id2)
  {
    SetFocalPoint_20(id0,id1,id2);
  }

  private native void SetFocalPoint_21(double id0[]);
  public void SetFocalPoint(double id0[])
  {
    SetFocalPoint_21(id0);
  }

  private native double[] GetFocalPoint_22();
  public double[] GetFocalPoint()
  {
    return GetFocalPoint_22();
  }

  private native void SetIntensity_23(double id0);
  public void SetIntensity(double id0)
  {
    SetIntensity_23(id0);
  }

  private native double GetIntensity_24();
  public double GetIntensity()
  {
    return GetIntensity_24();
  }

  private native void SetSwitch_25(int id0);
  public void SetSwitch(int id0)
  {
    SetSwitch_25(id0);
  }

  private native int GetSwitch_26();
  public int GetSwitch()
  {
    return GetSwitch_26();
  }

  private native void SwitchOn_27();
  public void SwitchOn()
  {
    SwitchOn_27();
  }

  private native void SwitchOff_28();
  public void SwitchOff()
  {
    SwitchOff_28();
  }

  private native void SetPositional_29(int id0);
  public void SetPositional(int id0)
  {
    SetPositional_29(id0);
  }

  private native int GetPositional_30();
  public int GetPositional()
  {
    return GetPositional_30();
  }

  private native void PositionalOn_31();
  public void PositionalOn()
  {
    PositionalOn_31();
  }

  private native void PositionalOff_32();
  public void PositionalOff()
  {
    PositionalOff_32();
  }

  private native void SetExponent_33(double id0);
  public void SetExponent(double id0)
  {
    SetExponent_33(id0);
  }

  private native double GetExponentMinValue_34();
  public double GetExponentMinValue()
  {
    return GetExponentMinValue_34();
  }

  private native double GetExponentMaxValue_35();
  public double GetExponentMaxValue()
  {
    return GetExponentMaxValue_35();
  }

  private native double GetExponent_36();
  public double GetExponent()
  {
    return GetExponent_36();
  }

  private native void SetConeAngle_37(double id0);
  public void SetConeAngle(double id0)
  {
    SetConeAngle_37(id0);
  }

  private native double GetConeAngle_38();
  public double GetConeAngle()
  {
    return GetConeAngle_38();
  }

  private native void SetAttenuationValues_39(double id0,double id1,double id2);
  public void SetAttenuationValues(double id0,double id1,double id2)
  {
    SetAttenuationValues_39(id0,id1,id2);
  }

  private native void SetAttenuationValues_40(double id0[]);
  public void SetAttenuationValues(double id0[])
  {
    SetAttenuationValues_40(id0);
  }

  private native double[] GetAttenuationValues_41();
  public double[] GetAttenuationValues()
  {
    return GetAttenuationValues_41();
  }

  private native void SetTransformMatrix_42(vtkMatrix4x4 id0);
  public void SetTransformMatrix(vtkMatrix4x4 id0)
  {
    SetTransformMatrix_42(id0);
  }

  private native long GetTransformMatrix_43();
  public vtkMatrix4x4 GetTransformMatrix()
  {
    long temp = GetTransformMatrix_43();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetTransformedPosition_44(double id0[]);
  public void GetTransformedPosition(double id0[])
  {
    GetTransformedPosition_44(id0);
  }

  private native double[] GetTransformedPosition_45();
  public double[] GetTransformedPosition()
  {
    return GetTransformedPosition_45();
  }

  private native void GetTransformedFocalPoint_46(double id0[]);
  public void GetTransformedFocalPoint(double id0[])
  {
    GetTransformedFocalPoint_46(id0);
  }

  private native double[] GetTransformedFocalPoint_47();
  public double[] GetTransformedFocalPoint()
  {
    return GetTransformedFocalPoint_47();
  }

  private native void TransformPoint_48(double id0[],double id1[]);
  public void TransformPoint(double id0[],double id1[])
  {
    TransformPoint_48(id0,id1);
  }

  private native void TransformVector_49(double id0[],double id1[]);
  public void TransformVector(double id0[],double id1[])
  {
    TransformVector_49(id0,id1);
  }

  private native void SetDirectionAngle_50(double id0,double id1);
  public void SetDirectionAngle(double id0,double id1)
  {
    SetDirectionAngle_50(id0,id1);
  }

  private native void SetDirectionAngle_51(double id0[]);
  public void SetDirectionAngle(double id0[])
  {
    SetDirectionAngle_51(id0);
  }

  private native void DeepCopy_52(vtkLight id0);
  public void DeepCopy(vtkLight id0)
  {
    DeepCopy_52(id0);
  }

  private native void SetLightType_53(int id0);
  public void SetLightType(int id0)
  {
    SetLightType_53(id0);
  }

  private native int GetLightType_54();
  public int GetLightType()
  {
    return GetLightType_54();
  }

  private native void SetLightTypeToHeadlight_55();
  public void SetLightTypeToHeadlight()
  {
    SetLightTypeToHeadlight_55();
  }

  private native void SetLightTypeToSceneLight_56();
  public void SetLightTypeToSceneLight()
  {
    SetLightTypeToSceneLight_56();
  }

  private native void SetLightTypeToCameraLight_57();
  public void SetLightTypeToCameraLight()
  {
    SetLightTypeToCameraLight_57();
  }

  private native int LightTypeIsHeadlight_58();
  public int LightTypeIsHeadlight()
  {
    return LightTypeIsHeadlight_58();
  }

  private native int LightTypeIsSceneLight_59();
  public int LightTypeIsSceneLight()
  {
    return LightTypeIsSceneLight_59();
  }

  private native int LightTypeIsCameraLight_60();
  public int LightTypeIsCameraLight()
  {
    return LightTypeIsCameraLight_60();
  }

  private native void SetShadowAttenuation_61(float id0);
  public void SetShadowAttenuation(float id0)
  {
    SetShadowAttenuation_61(id0);
  }

  private native float GetShadowAttenuation_62();
  public float GetShadowAttenuation()
  {
    return GetShadowAttenuation_62();
  }

  private native long GetInformation_63();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_63();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_64(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_64(id0);
  }

  public vtkLight() { super(); }

  public vtkLight(long id) { super(id); }
  public native long   VTKInit();

}
