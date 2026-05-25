// java wrapper for vtkAnnotatedCubeActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnnotatedCubeActor extends vtkProp3D
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

  private native void GetActors_4(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_4(id0);
  }

  private native int RenderOpaqueGeometry_5(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_5(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_6(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_6(id0);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void ShallowCopy_8(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_8(id0);
  }

  private native void ReleaseGraphicsResources_9(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_9(id0);
  }

  private native void GetBounds_10(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_10(id0);
  }

  private native double[] GetBounds_11();
  public double[] GetBounds()
  {
    return GetBounds_11();
  }

  private native long GetMTime_12();
  public long GetMTime()
  {
    return GetMTime_12();
  }

  private native void SetFaceTextScale_13(double id0);
  public void SetFaceTextScale(double id0)
  {
    SetFaceTextScale_13(id0);
  }

  private native double GetFaceTextScale_14();
  public double GetFaceTextScale()
  {
    return GetFaceTextScale_14();
  }

  private native long GetXPlusFaceProperty_15();
  public vtkProperty GetXPlusFaceProperty()
  {
    long temp = GetXPlusFaceProperty_15();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXMinusFaceProperty_16();
  public vtkProperty GetXMinusFaceProperty()
  {
    long temp = GetXMinusFaceProperty_16();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYPlusFaceProperty_17();
  public vtkProperty GetYPlusFaceProperty()
  {
    long temp = GetYPlusFaceProperty_17();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYMinusFaceProperty_18();
  public vtkProperty GetYMinusFaceProperty()
  {
    long temp = GetYMinusFaceProperty_18();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZPlusFaceProperty_19();
  public vtkProperty GetZPlusFaceProperty()
  {
    long temp = GetZPlusFaceProperty_19();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZMinusFaceProperty_20();
  public vtkProperty GetZMinusFaceProperty()
  {
    long temp = GetZMinusFaceProperty_20();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCubeProperty_21();
  public vtkProperty GetCubeProperty()
  {
    long temp = GetCubeProperty_21();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextEdgesProperty_22();
  public vtkProperty GetTextEdgesProperty()
  {
    long temp = GetTextEdgesProperty_22();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXPlusFaceText_23(byte[] id0, int len0);
  public void SetXPlusFaceText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXPlusFaceText_23(bytes0, bytes0.length);
  }

  private native byte[] GetXPlusFaceText_24();
  public String GetXPlusFaceText()
  {
    return new String(GetXPlusFaceText_24(), StandardCharsets.UTF_8);
  }

  private native void SetXMinusFaceText_25(byte[] id0, int len0);
  public void SetXMinusFaceText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXMinusFaceText_25(bytes0, bytes0.length);
  }

  private native byte[] GetXMinusFaceText_26();
  public String GetXMinusFaceText()
  {
    return new String(GetXMinusFaceText_26(), StandardCharsets.UTF_8);
  }

  private native void SetYPlusFaceText_27(byte[] id0, int len0);
  public void SetYPlusFaceText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYPlusFaceText_27(bytes0, bytes0.length);
  }

  private native byte[] GetYPlusFaceText_28();
  public String GetYPlusFaceText()
  {
    return new String(GetYPlusFaceText_28(), StandardCharsets.UTF_8);
  }

  private native void SetYMinusFaceText_29(byte[] id0, int len0);
  public void SetYMinusFaceText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYMinusFaceText_29(bytes0, bytes0.length);
  }

  private native byte[] GetYMinusFaceText_30();
  public String GetYMinusFaceText()
  {
    return new String(GetYMinusFaceText_30(), StandardCharsets.UTF_8);
  }

  private native void SetZPlusFaceText_31(byte[] id0, int len0);
  public void SetZPlusFaceText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZPlusFaceText_31(bytes0, bytes0.length);
  }

  private native byte[] GetZPlusFaceText_32();
  public String GetZPlusFaceText()
  {
    return new String(GetZPlusFaceText_32(), StandardCharsets.UTF_8);
  }

  private native void SetZMinusFaceText_33(byte[] id0, int len0);
  public void SetZMinusFaceText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZMinusFaceText_33(bytes0, bytes0.length);
  }

  private native byte[] GetZMinusFaceText_34();
  public String GetZMinusFaceText()
  {
    return new String(GetZMinusFaceText_34(), StandardCharsets.UTF_8);
  }

  private native void SetTextEdgesVisibility_35(int id0);
  public void SetTextEdgesVisibility(int id0)
  {
    SetTextEdgesVisibility_35(id0);
  }

  private native int GetTextEdgesVisibility_36();
  public int GetTextEdgesVisibility()
  {
    return GetTextEdgesVisibility_36();
  }

  private native void SetCubeVisibility_37(int id0);
  public void SetCubeVisibility(int id0)
  {
    SetCubeVisibility_37(id0);
  }

  private native int GetCubeVisibility_38();
  public int GetCubeVisibility()
  {
    return GetCubeVisibility_38();
  }

  private native void SetFaceTextVisibility_39(int id0);
  public void SetFaceTextVisibility(int id0)
  {
    SetFaceTextVisibility_39(id0);
  }

  private native int GetFaceTextVisibility_40();
  public int GetFaceTextVisibility()
  {
    return GetFaceTextVisibility_40();
  }

  private native void SetXFaceTextRotation_41(double id0);
  public void SetXFaceTextRotation(double id0)
  {
    SetXFaceTextRotation_41(id0);
  }

  private native double GetXFaceTextRotation_42();
  public double GetXFaceTextRotation()
  {
    return GetXFaceTextRotation_42();
  }

  private native void SetYFaceTextRotation_43(double id0);
  public void SetYFaceTextRotation(double id0)
  {
    SetYFaceTextRotation_43(id0);
  }

  private native double GetYFaceTextRotation_44();
  public double GetYFaceTextRotation()
  {
    return GetYFaceTextRotation_44();
  }

  private native void SetZFaceTextRotation_45(double id0);
  public void SetZFaceTextRotation(double id0)
  {
    SetZFaceTextRotation_45(id0);
  }

  private native double GetZFaceTextRotation_46();
  public double GetZFaceTextRotation()
  {
    return GetZFaceTextRotation_46();
  }

  private native long GetAssembly_47();
  public vtkAssembly GetAssembly()
  {
    long temp = GetAssembly_47();

    if (temp == 0) return null;
    return (vtkAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAnnotatedCubeActor() { super(); }

  public vtkAnnotatedCubeActor(long id) { super(id); }
  public native long   VTKInit();

}
