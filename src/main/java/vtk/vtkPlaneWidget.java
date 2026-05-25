// java wrapper for vtkPlaneWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlaneWidget extends vtkPolyDataSourceWidget
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

  private native void SetResolution_8(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_8(id0);
  }

  private native int GetResolution_9();
  public int GetResolution()
  {
    return GetResolution_9();
  }

  private native void SetOrigin_10(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_10(id0,id1,id2);
  }

  private native void SetOrigin_11(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_11(id0);
  }

  private native double[] GetOrigin_12();
  public double[] GetOrigin()
  {
    return GetOrigin_12();
  }

  private native void GetOrigin_13(double id0[]);
  public void GetOrigin(double id0[])
  {
    GetOrigin_13(id0);
  }

  private native void SetPoint1_14(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_14(id0,id1,id2);
  }

  private native void SetPoint1_15(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_15(id0);
  }

  private native double[] GetPoint1_16();
  public double[] GetPoint1()
  {
    return GetPoint1_16();
  }

  private native void GetPoint1_17(double id0[]);
  public void GetPoint1(double id0[])
  {
    GetPoint1_17(id0);
  }

  private native void SetPoint2_18(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_18(id0,id1,id2);
  }

  private native void SetPoint2_19(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_19(id0);
  }

  private native double[] GetPoint2_20();
  public double[] GetPoint2()
  {
    return GetPoint2_20();
  }

  private native void GetPoint2_21(double id0[]);
  public void GetPoint2(double id0[])
  {
    GetPoint2_21(id0);
  }

  private native void SetCenter_22(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_22(id0,id1,id2);
  }

  private native void SetCenter_23(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_23(id0);
  }

  private native double[] GetCenter_24();
  public double[] GetCenter()
  {
    return GetCenter_24();
  }

  private native void GetCenter_25(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_25(id0);
  }

  private native void SetNormal_26(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_26(id0,id1,id2);
  }

  private native void SetNormal_27(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_27(id0);
  }

  private native double[] GetNormal_28();
  public double[] GetNormal()
  {
    return GetNormal_28();
  }

  private native void GetNormal_29(double id0[]);
  public void GetNormal(double id0[])
  {
    GetNormal_29(id0);
  }

  private native void SetRepresentation_30(int id0);
  public void SetRepresentation(int id0)
  {
    SetRepresentation_30(id0);
  }

  private native int GetRepresentationMinValue_31();
  public int GetRepresentationMinValue()
  {
    return GetRepresentationMinValue_31();
  }

  private native int GetRepresentationMaxValue_32();
  public int GetRepresentationMaxValue()
  {
    return GetRepresentationMaxValue_32();
  }

  private native int GetRepresentation_33();
  public int GetRepresentation()
  {
    return GetRepresentation_33();
  }

  private native void SetRepresentationToOff_34();
  public void SetRepresentationToOff()
  {
    SetRepresentationToOff_34();
  }

  private native void SetRepresentationToOutline_35();
  public void SetRepresentationToOutline()
  {
    SetRepresentationToOutline_35();
  }

  private native void SetRepresentationToWireframe_36();
  public void SetRepresentationToWireframe()
  {
    SetRepresentationToWireframe_36();
  }

  private native void SetRepresentationToSurface_37();
  public void SetRepresentationToSurface()
  {
    SetRepresentationToSurface_37();
  }

  private native void SetNormalToXAxis_38(int id0);
  public void SetNormalToXAxis(int id0)
  {
    SetNormalToXAxis_38(id0);
  }

  private native int GetNormalToXAxis_39();
  public int GetNormalToXAxis()
  {
    return GetNormalToXAxis_39();
  }

  private native void NormalToXAxisOn_40();
  public void NormalToXAxisOn()
  {
    NormalToXAxisOn_40();
  }

  private native void NormalToXAxisOff_41();
  public void NormalToXAxisOff()
  {
    NormalToXAxisOff_41();
  }

  private native void SetNormalToYAxis_42(int id0);
  public void SetNormalToYAxis(int id0)
  {
    SetNormalToYAxis_42(id0);
  }

  private native int GetNormalToYAxis_43();
  public int GetNormalToYAxis()
  {
    return GetNormalToYAxis_43();
  }

  private native void NormalToYAxisOn_44();
  public void NormalToYAxisOn()
  {
    NormalToYAxisOn_44();
  }

  private native void NormalToYAxisOff_45();
  public void NormalToYAxisOff()
  {
    NormalToYAxisOff_45();
  }

  private native void SetNormalToZAxis_46(int id0);
  public void SetNormalToZAxis(int id0)
  {
    SetNormalToZAxis_46(id0);
  }

  private native int GetNormalToZAxis_47();
  public int GetNormalToZAxis()
  {
    return GetNormalToZAxis_47();
  }

  private native void NormalToZAxisOn_48();
  public void NormalToZAxisOn()
  {
    NormalToZAxisOn_48();
  }

  private native void NormalToZAxisOff_49();
  public void NormalToZAxisOff()
  {
    NormalToZAxisOff_49();
  }

  private native void GetPolyData_50(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_50(id0);
  }

  private native void GetPlane_51(vtkPlane id0);
  public void GetPlane(vtkPlane id0)
  {
    GetPlane_51(id0);
  }

  private native long GetPolyDataAlgorithm_52();
  public vtkPolyDataAlgorithm GetPolyDataAlgorithm()
  {
    long temp = GetPolyDataAlgorithm_52();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdatePlacement_53();
  public void UpdatePlacement()
  {
    UpdatePlacement_53();
  }

  private native long GetHandleProperty_54();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_54();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_55();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_55();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlaneProperty_56(vtkProperty id0);
  public void SetPlaneProperty(vtkProperty id0)
  {
    SetPlaneProperty_56(id0);
  }

  private native long GetPlaneProperty_57();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_57();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPlaneProperty_58();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_58();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPlaneWidget() { super(); }

  public vtkPlaneWidget(long id) { super(id); }
  public native long   VTKInit();

}
