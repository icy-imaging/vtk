// java wrapper for vtkSphereWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereWidget extends vtk3DWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void PlaceWidget_6();
  public void PlaceWidget()
  {
    PlaceWidget_6();
  }

  private native void PlaceWidget_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetRepresentation_8(int id0);
  public void SetRepresentation(int id0)
  {
    SetRepresentation_8(id0);
  }

  private native int GetRepresentationMinValue_9();
  public int GetRepresentationMinValue()
  {
    return GetRepresentationMinValue_9();
  }

  private native int GetRepresentationMaxValue_10();
  public int GetRepresentationMaxValue()
  {
    return GetRepresentationMaxValue_10();
  }

  private native int GetRepresentation_11();
  public int GetRepresentation()
  {
    return GetRepresentation_11();
  }

  private native void SetRepresentationToOff_12();
  public void SetRepresentationToOff()
  {
    SetRepresentationToOff_12();
  }

  private native void SetRepresentationToWireframe_13();
  public void SetRepresentationToWireframe()
  {
    SetRepresentationToWireframe_13();
  }

  private native void SetRepresentationToSurface_14();
  public void SetRepresentationToSurface()
  {
    SetRepresentationToSurface_14();
  }

  private native void SetThetaResolution_15(int id0);
  public void SetThetaResolution(int id0)
  {
    SetThetaResolution_15(id0);
  }

  private native int GetThetaResolution_16();
  public int GetThetaResolution()
  {
    return GetThetaResolution_16();
  }

  private native void SetPhiResolution_17(int id0);
  public void SetPhiResolution(int id0)
  {
    SetPhiResolution_17(id0);
  }

  private native int GetPhiResolution_18();
  public int GetPhiResolution()
  {
    return GetPhiResolution_18();
  }

  private native void SetRadius_19(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_19(id0);
  }

  private native double GetRadius_20();
  public double GetRadius()
  {
    return GetRadius_20();
  }

  private native void SetCenter_21(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_21(id0,id1,id2);
  }

  private native void SetCenter_22(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_22(id0);
  }

  private native double[] GetCenter_23();
  public double[] GetCenter()
  {
    return GetCenter_23();
  }

  private native void GetCenter_24(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_24(id0);
  }

  private native void SetTranslation_25(int id0);
  public void SetTranslation(int id0)
  {
    SetTranslation_25(id0);
  }

  private native int GetTranslation_26();
  public int GetTranslation()
  {
    return GetTranslation_26();
  }

  private native void TranslationOn_27();
  public void TranslationOn()
  {
    TranslationOn_27();
  }

  private native void TranslationOff_28();
  public void TranslationOff()
  {
    TranslationOff_28();
  }

  private native void SetScale_29(int id0);
  public void SetScale(int id0)
  {
    SetScale_29(id0);
  }

  private native int GetScale_30();
  public int GetScale()
  {
    return GetScale_30();
  }

  private native void ScaleOn_31();
  public void ScaleOn()
  {
    ScaleOn_31();
  }

  private native void ScaleOff_32();
  public void ScaleOff()
  {
    ScaleOff_32();
  }

  private native void SetHandleVisibility_33(int id0);
  public void SetHandleVisibility(int id0)
  {
    SetHandleVisibility_33(id0);
  }

  private native int GetHandleVisibility_34();
  public int GetHandleVisibility()
  {
    return GetHandleVisibility_34();
  }

  private native void HandleVisibilityOn_35();
  public void HandleVisibilityOn()
  {
    HandleVisibilityOn_35();
  }

  private native void HandleVisibilityOff_36();
  public void HandleVisibilityOff()
  {
    HandleVisibilityOff_36();
  }

  private native void SetHandleDirection_37(double id0,double id1,double id2);
  public void SetHandleDirection(double id0,double id1,double id2)
  {
    SetHandleDirection_37(id0,id1,id2);
  }

  private native void SetHandleDirection_38(double id0[]);
  public void SetHandleDirection(double id0[])
  {
    SetHandleDirection_38(id0);
  }

  private native double[] GetHandleDirection_39();
  public double[] GetHandleDirection()
  {
    return GetHandleDirection_39();
  }

  private native double[] GetHandlePosition_40();
  public double[] GetHandlePosition()
  {
    return GetHandlePosition_40();
  }

  private native void GetPolyData_41(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_41(id0);
  }

  private native void GetSphere_42(vtkSphere id0);
  public void GetSphere(vtkSphere id0)
  {
    GetSphere_42(id0);
  }

  private native long GetSphereProperty_43();
  public vtkProperty GetSphereProperty()
  {
    long temp = GetSphereProperty_43();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedSphereProperty_44();
  public vtkProperty GetSelectedSphereProperty()
  {
    long temp = GetSelectedSphereProperty_44();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHandleProperty_45();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_45();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_46();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_46();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSphereWidget() { super(); }

  public vtkSphereWidget(long id) { super(id); }
  public native long   VTKInit();

}
