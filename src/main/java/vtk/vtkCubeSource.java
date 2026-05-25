// java wrapper for vtkCubeSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCubeSource extends vtkPolyDataAlgorithm
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

  private native void SetXLength_4(double id0);
  public void SetXLength(double id0)
  {
    SetXLength_4(id0);
  }

  private native double GetXLengthMinValue_5();
  public double GetXLengthMinValue()
  {
    return GetXLengthMinValue_5();
  }

  private native double GetXLengthMaxValue_6();
  public double GetXLengthMaxValue()
  {
    return GetXLengthMaxValue_6();
  }

  private native double GetXLength_7();
  public double GetXLength()
  {
    return GetXLength_7();
  }

  private native void SetYLength_8(double id0);
  public void SetYLength(double id0)
  {
    SetYLength_8(id0);
  }

  private native double GetYLengthMinValue_9();
  public double GetYLengthMinValue()
  {
    return GetYLengthMinValue_9();
  }

  private native double GetYLengthMaxValue_10();
  public double GetYLengthMaxValue()
  {
    return GetYLengthMaxValue_10();
  }

  private native double GetYLength_11();
  public double GetYLength()
  {
    return GetYLength_11();
  }

  private native void SetZLength_12(double id0);
  public void SetZLength(double id0)
  {
    SetZLength_12(id0);
  }

  private native double GetZLengthMinValue_13();
  public double GetZLengthMinValue()
  {
    return GetZLengthMinValue_13();
  }

  private native double GetZLengthMaxValue_14();
  public double GetZLengthMaxValue()
  {
    return GetZLengthMaxValue_14();
  }

  private native double GetZLength_15();
  public double GetZLength()
  {
    return GetZLength_15();
  }

  private native void SetCenter_16(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_16(id0,id1,id2);
  }

  private native void SetCenter_17(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_17(id0);
  }

  private native double[] GetCenter_18();
  public double[] GetCenter()
  {
    return GetCenter_18();
  }

  private native void SetBounds_19(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_19(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_20(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_20(id0);
  }

  private native void GetBounds_21(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_21(id0);
  }

  private native void SetOutputPointsPrecision_22(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_22(id0);
  }

  private native int GetOutputPointsPrecision_23();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_23();
  }

  public vtkCubeSource() { super(); }

  public vtkCubeSource(long id) { super(id); }
  public native long   VTKInit();

}
