// java wrapper for vtkConeSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConeSource extends vtkPolyDataAlgorithm
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

  private native void SetHeight_4(double id0);
  public void SetHeight(double id0)
  {
    SetHeight_4(id0);
  }

  private native double GetHeightMinValue_5();
  public double GetHeightMinValue()
  {
    return GetHeightMinValue_5();
  }

  private native double GetHeightMaxValue_6();
  public double GetHeightMaxValue()
  {
    return GetHeightMaxValue_6();
  }

  private native double GetHeight_7();
  public double GetHeight()
  {
    return GetHeight_7();
  }

  private native void SetRadius_8(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_8(id0);
  }

  private native double GetRadiusMinValue_9();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_9();
  }

  private native double GetRadiusMaxValue_10();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_10();
  }

  private native double GetRadius_11();
  public double GetRadius()
  {
    return GetRadius_11();
  }

  private native void SetResolution_12(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_12(id0);
  }

  private native int GetResolutionMinValue_13();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_13();
  }

  private native int GetResolutionMaxValue_14();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_14();
  }

  private native int GetResolution_15();
  public int GetResolution()
  {
    return GetResolution_15();
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

  private native void SetDirection_19(double id0,double id1,double id2);
  public void SetDirection(double id0,double id1,double id2)
  {
    SetDirection_19(id0,id1,id2);
  }

  private native void SetDirection_20(double id0[]);
  public void SetDirection(double id0[])
  {
    SetDirection_20(id0);
  }

  private native double[] GetDirection_21();
  public double[] GetDirection()
  {
    return GetDirection_21();
  }

  private native void SetAngle_22(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_22(id0);
  }

  private native double GetAngle_23();
  public double GetAngle()
  {
    return GetAngle_23();
  }

  private native void SetCapping_24(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_24(id0);
  }

  private native int GetCapping_25();
  public int GetCapping()
  {
    return GetCapping_25();
  }

  private native void CappingOn_26();
  public void CappingOn()
  {
    CappingOn_26();
  }

  private native void CappingOff_27();
  public void CappingOff()
  {
    CappingOff_27();
  }

  private native void SetOutputPointsPrecision_28(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_28(id0);
  }

  private native int GetOutputPointsPrecision_29();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_29();
  }

  public vtkConeSource() { super(); }

  public vtkConeSource(long id) { super(id); }
  public native long   VTKInit();

}
