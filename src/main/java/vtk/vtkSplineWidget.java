// java wrapper for vtkSplineWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplineWidget extends vtk3DWidget
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

  private native void SetProjectToPlane_8(int id0);
  public void SetProjectToPlane(int id0)
  {
    SetProjectToPlane_8(id0);
  }

  private native int GetProjectToPlane_9();
  public int GetProjectToPlane()
  {
    return GetProjectToPlane_9();
  }

  private native void ProjectToPlaneOn_10();
  public void ProjectToPlaneOn()
  {
    ProjectToPlaneOn_10();
  }

  private native void ProjectToPlaneOff_11();
  public void ProjectToPlaneOff()
  {
    ProjectToPlaneOff_11();
  }

  private native void SetPlaneSource_12(vtkPlaneSource id0);
  public void SetPlaneSource(vtkPlaneSource id0)
  {
    SetPlaneSource_12(id0);
  }

  private native void SetProjectionNormal_13(int id0);
  public void SetProjectionNormal(int id0)
  {
    SetProjectionNormal_13(id0);
  }

  private native int GetProjectionNormalMinValue_14();
  public int GetProjectionNormalMinValue()
  {
    return GetProjectionNormalMinValue_14();
  }

  private native int GetProjectionNormalMaxValue_15();
  public int GetProjectionNormalMaxValue()
  {
    return GetProjectionNormalMaxValue_15();
  }

  private native int GetProjectionNormal_16();
  public int GetProjectionNormal()
  {
    return GetProjectionNormal_16();
  }

  private native void SetProjectionNormalToXAxes_17();
  public void SetProjectionNormalToXAxes()
  {
    SetProjectionNormalToXAxes_17();
  }

  private native void SetProjectionNormalToYAxes_18();
  public void SetProjectionNormalToYAxes()
  {
    SetProjectionNormalToYAxes_18();
  }

  private native void SetProjectionNormalToZAxes_19();
  public void SetProjectionNormalToZAxes()
  {
    SetProjectionNormalToZAxes_19();
  }

  private native void SetProjectionNormalToOblique_20();
  public void SetProjectionNormalToOblique()
  {
    SetProjectionNormalToOblique_20();
  }

  private native void SetProjectionPosition_21(double id0);
  public void SetProjectionPosition(double id0)
  {
    SetProjectionPosition_21(id0);
  }

  private native double GetProjectionPosition_22();
  public double GetProjectionPosition()
  {
    return GetProjectionPosition_22();
  }

  private native void GetPolyData_23(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_23(id0);
  }

  private native void SetHandleProperty_24(vtkProperty id0);
  public void SetHandleProperty(vtkProperty id0)
  {
    SetHandleProperty_24(id0);
  }

  private native long GetHandleProperty_25();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_25();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectedHandleProperty_26(vtkProperty id0);
  public void SetSelectedHandleProperty(vtkProperty id0)
  {
    SetSelectedHandleProperty_26(id0);
  }

  private native long GetSelectedHandleProperty_27();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_27();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLineProperty_28(vtkProperty id0);
  public void SetLineProperty(vtkProperty id0)
  {
    SetLineProperty_28(id0);
  }

  private native long GetLineProperty_29();
  public vtkProperty GetLineProperty()
  {
    long temp = GetLineProperty_29();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectedLineProperty_30(vtkProperty id0);
  public void SetSelectedLineProperty(vtkProperty id0)
  {
    SetSelectedLineProperty_30(id0);
  }

  private native long GetSelectedLineProperty_31();
  public vtkProperty GetSelectedLineProperty()
  {
    long temp = GetSelectedLineProperty_31();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfHandles_32(int id0);
  public void SetNumberOfHandles(int id0)
  {
    SetNumberOfHandles_32(id0);
  }

  private native int GetNumberOfHandles_33();
  public int GetNumberOfHandles()
  {
    return GetNumberOfHandles_33();
  }

  private native void SetResolution_34(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_34(id0);
  }

  private native int GetResolution_35();
  public int GetResolution()
  {
    return GetResolution_35();
  }

  private native void SetParametricSpline_36(vtkParametricSpline id0);
  public void SetParametricSpline(vtkParametricSpline id0)
  {
    SetParametricSpline_36(id0);
  }

  private native long GetParametricSpline_37();
  public vtkParametricSpline GetParametricSpline()
  {
    long temp = GetParametricSpline_37();

    if (temp == 0) return null;
    return (vtkParametricSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHandlePosition_38(int id0,double id1,double id2,double id3);
  public void SetHandlePosition(int id0,double id1,double id2,double id3)
  {
    SetHandlePosition_38(id0,id1,id2,id3);
  }

  private native void SetHandlePosition_39(int id0,double id1[]);
  public void SetHandlePosition(int id0,double id1[])
  {
    SetHandlePosition_39(id0,id1);
  }

  private native void GetHandlePosition_40(int id0,double id1[]);
  public void GetHandlePosition(int id0,double id1[])
  {
    GetHandlePosition_40(id0,id1);
  }

  private native double[] GetHandlePosition_41(int id0);
  public double[] GetHandlePosition(int id0)
  {
    return GetHandlePosition_41(id0);
  }

  private native void SetClosed_42(int id0);
  public void SetClosed(int id0)
  {
    SetClosed_42(id0);
  }

  private native int GetClosed_43();
  public int GetClosed()
  {
    return GetClosed_43();
  }

  private native void ClosedOn_44();
  public void ClosedOn()
  {
    ClosedOn_44();
  }

  private native void ClosedOff_45();
  public void ClosedOff()
  {
    ClosedOff_45();
  }

  private native int IsClosed_46();
  public int IsClosed()
  {
    return IsClosed_46();
  }

  private native double GetSummedLength_47();
  public double GetSummedLength()
  {
    return GetSummedLength_47();
  }

  private native void InitializeHandles_48(vtkPoints id0);
  public void InitializeHandles(vtkPoints id0)
  {
    InitializeHandles_48(id0);
  }

  private native void SetProcessEvents_49(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_49(id0);
  }

  private native int GetProcessEventsMinValue_50();
  public int GetProcessEventsMinValue()
  {
    return GetProcessEventsMinValue_50();
  }

  private native int GetProcessEventsMaxValue_51();
  public int GetProcessEventsMaxValue()
  {
    return GetProcessEventsMaxValue_51();
  }

  private native int GetProcessEvents_52();
  public int GetProcessEvents()
  {
    return GetProcessEvents_52();
  }

  private native void ProcessEventsOn_53();
  public void ProcessEventsOn()
  {
    ProcessEventsOn_53();
  }

  private native void ProcessEventsOff_54();
  public void ProcessEventsOff()
  {
    ProcessEventsOff_54();
  }

  public vtkSplineWidget() { super(); }

  public vtkSplineWidget(long id) { super(id); }
  public native long   VTKInit();

}
