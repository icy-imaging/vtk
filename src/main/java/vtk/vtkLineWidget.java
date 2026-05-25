// java wrapper for vtkLineWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLineWidget extends vtk3DWidget
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

  private native void SetPoint1_10(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_10(id0,id1,id2);
  }

  private native void SetPoint1_11(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_11(id0);
  }

  private native double[] GetPoint1_12();
  public double[] GetPoint1()
  {
    return GetPoint1_12();
  }

  private native void GetPoint1_13(double id0[]);
  public void GetPoint1(double id0[])
  {
    GetPoint1_13(id0);
  }

  private native void SetPoint2_14(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_14(id0,id1,id2);
  }

  private native void SetPoint2_15(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_15(id0);
  }

  private native double[] GetPoint2_16();
  public double[] GetPoint2()
  {
    return GetPoint2_16();
  }

  private native void GetPoint2_17(double id0[]);
  public void GetPoint2(double id0[])
  {
    GetPoint2_17(id0);
  }

  private native void SetAlign_18(int id0);
  public void SetAlign(int id0)
  {
    SetAlign_18(id0);
  }

  private native int GetAlignMinValue_19();
  public int GetAlignMinValue()
  {
    return GetAlignMinValue_19();
  }

  private native int GetAlignMaxValue_20();
  public int GetAlignMaxValue()
  {
    return GetAlignMaxValue_20();
  }

  private native int GetAlign_21();
  public int GetAlign()
  {
    return GetAlign_21();
  }

  private native void SetAlignToXAxis_22();
  public void SetAlignToXAxis()
  {
    SetAlignToXAxis_22();
  }

  private native void SetAlignToYAxis_23();
  public void SetAlignToYAxis()
  {
    SetAlignToYAxis_23();
  }

  private native void SetAlignToZAxis_24();
  public void SetAlignToZAxis()
  {
    SetAlignToZAxis_24();
  }

  private native void SetAlignToNone_25();
  public void SetAlignToNone()
  {
    SetAlignToNone_25();
  }

  private native void SetClampToBounds_26(int id0);
  public void SetClampToBounds(int id0)
  {
    SetClampToBounds_26(id0);
  }

  private native int GetClampToBounds_27();
  public int GetClampToBounds()
  {
    return GetClampToBounds_27();
  }

  private native void ClampToBoundsOn_28();
  public void ClampToBoundsOn()
  {
    ClampToBoundsOn_28();
  }

  private native void ClampToBoundsOff_29();
  public void ClampToBoundsOff()
  {
    ClampToBoundsOff_29();
  }

  private native void GetPolyData_30(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_30(id0);
  }

  private native long GetHandleProperty_31();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_31();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_32();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_32();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLineProperty_33();
  public vtkProperty GetLineProperty()
  {
    long temp = GetLineProperty_33();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLineProperty_34();
  public vtkProperty GetSelectedLineProperty()
  {
    long temp = GetSelectedLineProperty_34();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLineWidget() { super(); }

  public vtkLineWidget(long id) { super(id); }
  public native long   VTKInit();

}
