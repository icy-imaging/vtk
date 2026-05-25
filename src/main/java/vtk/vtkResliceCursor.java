// java wrapper for vtkResliceCursor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursor extends vtkObject
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

  private native void SetImage_4(vtkImageData id0);
  public void SetImage(vtkImageData id0)
  {
    SetImage_4(id0);
  }

  private native long GetImage_5();
  public vtkImageData GetImage()
  {
    long temp = GetImage_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCenter_6(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_6(id0,id1,id2);
  }

  private native void SetCenter_7(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_7(id0);
  }

  private native double[] GetCenter_8();
  public double[] GetCenter()
  {
    return GetCenter_8();
  }

  private native void SetThickness_9(double id0,double id1,double id2);
  public void SetThickness(double id0,double id1,double id2)
  {
    SetThickness_9(id0,id1,id2);
  }

  private native void SetThickness_10(double id0[]);
  public void SetThickness(double id0[])
  {
    SetThickness_10(id0);
  }

  private native double[] GetThickness_11();
  public double[] GetThickness()
  {
    return GetThickness_11();
  }

  private native void SetThickMode_12(int id0);
  public void SetThickMode(int id0)
  {
    SetThickMode_12(id0);
  }

  private native int GetThickMode_13();
  public int GetThickMode()
  {
    return GetThickMode_13();
  }

  private native void ThickModeOn_14();
  public void ThickModeOn()
  {
    ThickModeOn_14();
  }

  private native void ThickModeOff_15();
  public void ThickModeOff()
  {
    ThickModeOff_15();
  }

  private native long GetPolyData_16();
  public vtkPolyData GetPolyData()
  {
    long temp = GetPolyData_16();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCenterlineAxisPolyData_17(int id0);
  public vtkPolyData GetCenterlineAxisPolyData(int id0)
  {
    long temp = GetCenterlineAxisPolyData_17(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlane_18(int id0);
  public vtkPlane GetPlane(int id0)
  {
    long temp = GetPlane_18(id0);

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_19();
  public void Update()
  {
    Update_19();
  }

  private native double[] GetXAxis_20();
  public double[] GetXAxis()
  {
    return GetXAxis_20();
  }

  private native double[] GetYAxis_21();
  public double[] GetYAxis()
  {
    return GetYAxis_21();
  }

  private native double[] GetZAxis_22();
  public double[] GetZAxis()
  {
    return GetZAxis_22();
  }

  private native void SetXAxis_23(double id0,double id1,double id2);
  public void SetXAxis(double id0,double id1,double id2)
  {
    SetXAxis_23(id0,id1,id2);
  }

  private native void SetXAxis_24(double id0[]);
  public void SetXAxis(double id0[])
  {
    SetXAxis_24(id0);
  }

  private native void SetYAxis_25(double id0,double id1,double id2);
  public void SetYAxis(double id0,double id1,double id2)
  {
    SetYAxis_25(id0,id1,id2);
  }

  private native void SetYAxis_26(double id0[]);
  public void SetYAxis(double id0[])
  {
    SetYAxis_26(id0);
  }

  private native void SetZAxis_27(double id0,double id1,double id2);
  public void SetZAxis(double id0,double id1,double id2)
  {
    SetZAxis_27(id0,id1,id2);
  }

  private native void SetZAxis_28(double id0[]);
  public void SetZAxis(double id0[])
  {
    SetZAxis_28(id0);
  }

  private native double[] GetXViewUp_29();
  public double[] GetXViewUp()
  {
    return GetXViewUp_29();
  }

  private native double[] GetYViewUp_30();
  public double[] GetYViewUp()
  {
    return GetYViewUp_30();
  }

  private native double[] GetZViewUp_31();
  public double[] GetZViewUp()
  {
    return GetZViewUp_31();
  }

  private native void SetXViewUp_32(double id0,double id1,double id2);
  public void SetXViewUp(double id0,double id1,double id2)
  {
    SetXViewUp_32(id0,id1,id2);
  }

  private native void SetXViewUp_33(double id0[]);
  public void SetXViewUp(double id0[])
  {
    SetXViewUp_33(id0);
  }

  private native void SetYViewUp_34(double id0,double id1,double id2);
  public void SetYViewUp(double id0,double id1,double id2)
  {
    SetYViewUp_34(id0,id1,id2);
  }

  private native void SetYViewUp_35(double id0[]);
  public void SetYViewUp(double id0[])
  {
    SetYViewUp_35(id0);
  }

  private native void SetZViewUp_36(double id0,double id1,double id2);
  public void SetZViewUp(double id0,double id1,double id2)
  {
    SetZViewUp_36(id0,id1,id2);
  }

  private native void SetZViewUp_37(double id0[]);
  public void SetZViewUp(double id0[])
  {
    SetZViewUp_37(id0);
  }

  private native void SetHole_38(int id0);
  public void SetHole(int id0)
  {
    SetHole_38(id0);
  }

  private native int GetHole_39();
  public int GetHole()
  {
    return GetHole_39();
  }

  private native void SetHoleWidth_40(double id0);
  public void SetHoleWidth(double id0)
  {
    SetHoleWidth_40(id0);
  }

  private native double GetHoleWidth_41();
  public double GetHoleWidth()
  {
    return GetHoleWidth_41();
  }

  private native void SetHoleWidthInPixels_42(double id0);
  public void SetHoleWidthInPixels(double id0)
  {
    SetHoleWidthInPixels_42(id0);
  }

  private native double GetHoleWidthInPixels_43();
  public double GetHoleWidthInPixels()
  {
    return GetHoleWidthInPixels_43();
  }

  private native long GetMTime_44();
  public long GetMTime()
  {
    return GetMTime_44();
  }

  private native void Reset_45();
  public void Reset()
  {
    Reset_45();
  }

  public vtkResliceCursor() { super(); }

  public vtkResliceCursor(long id) { super(id); }
  public native long   VTKInit();

}
