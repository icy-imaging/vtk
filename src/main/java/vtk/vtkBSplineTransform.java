// java wrapper for vtkBSplineTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBSplineTransform extends vtkWarpTransform
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

  private native void SetCoefficientConnection_4(vtkAlgorithmOutput id0);
  public void SetCoefficientConnection(vtkAlgorithmOutput id0)
  {
    SetCoefficientConnection_4(id0);
  }

  private native void SetCoefficientData_5(vtkImageData id0);
  public void SetCoefficientData(vtkImageData id0)
  {
    SetCoefficientData_5(id0);
  }

  private native long GetCoefficientData_6();
  public vtkImageData GetCoefficientData()
  {
    long temp = GetCoefficientData_6();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisplacementScale_7(double id0);
  public void SetDisplacementScale(double id0)
  {
    SetDisplacementScale_7(id0);
  }

  private native double GetDisplacementScale_8();
  public double GetDisplacementScale()
  {
    return GetDisplacementScale_8();
  }

  private native void SetBorderMode_9(int id0);
  public void SetBorderMode(int id0)
  {
    SetBorderMode_9(id0);
  }

  private native int GetBorderModeMinValue_10();
  public int GetBorderModeMinValue()
  {
    return GetBorderModeMinValue_10();
  }

  private native int GetBorderModeMaxValue_11();
  public int GetBorderModeMaxValue()
  {
    return GetBorderModeMaxValue_11();
  }

  private native void SetBorderModeToEdge_12();
  public void SetBorderModeToEdge()
  {
    SetBorderModeToEdge_12();
  }

  private native void SetBorderModeToZero_13();
  public void SetBorderModeToZero()
  {
    SetBorderModeToZero_13();
  }

  private native void SetBorderModeToZeroAtBorder_14();
  public void SetBorderModeToZeroAtBorder()
  {
    SetBorderModeToZeroAtBorder_14();
  }

  private native int GetBorderMode_15();
  public int GetBorderMode()
  {
    return GetBorderMode_15();
  }

  private native byte[] GetBorderModeAsString_16();
  public String GetBorderModeAsString()
  {
    return new String(GetBorderModeAsString_16(), StandardCharsets.UTF_8);
  }

  private native long MakeTransform_17();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_17();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  public vtkBSplineTransform() { super(); }

  public vtkBSplineTransform(long id) { super(id); }
  public native long   VTKInit();

}
