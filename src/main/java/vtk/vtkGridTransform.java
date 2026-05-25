// java wrapper for vtkGridTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGridTransform extends vtkWarpTransform
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

  private native void SetDisplacementGridConnection_4(vtkAlgorithmOutput id0);
  public void SetDisplacementGridConnection(vtkAlgorithmOutput id0)
  {
    SetDisplacementGridConnection_4(id0);
  }

  private native void SetDisplacementGridData_5(vtkImageData id0);
  public void SetDisplacementGridData(vtkImageData id0)
  {
    SetDisplacementGridData_5(id0);
  }

  private native long GetDisplacementGrid_6();
  public vtkImageData GetDisplacementGrid()
  {
    long temp = GetDisplacementGrid_6();

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

  private native void SetDisplacementShift_9(double id0);
  public void SetDisplacementShift(double id0)
  {
    SetDisplacementShift_9(id0);
  }

  private native double GetDisplacementShift_10();
  public double GetDisplacementShift()
  {
    return GetDisplacementShift_10();
  }

  private native void SetInterpolationMode_11(int id0);
  public void SetInterpolationMode(int id0)
  {
    SetInterpolationMode_11(id0);
  }

  private native int GetInterpolationMode_12();
  public int GetInterpolationMode()
  {
    return GetInterpolationMode_12();
  }

  private native void SetInterpolationModeToNearestNeighbor_13();
  public void SetInterpolationModeToNearestNeighbor()
  {
    SetInterpolationModeToNearestNeighbor_13();
  }

  private native void SetInterpolationModeToLinear_14();
  public void SetInterpolationModeToLinear()
  {
    SetInterpolationModeToLinear_14();
  }

  private native void SetInterpolationModeToCubic_15();
  public void SetInterpolationModeToCubic()
  {
    SetInterpolationModeToCubic_15();
  }

  private native byte[] GetInterpolationModeAsString_16();
  public String GetInterpolationModeAsString()
  {
    return new String(GetInterpolationModeAsString_16(), StandardCharsets.UTF_8);
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

  public vtkGridTransform() { super(); }

  public vtkGridTransform(long id) { super(id); }
  public native long   VTKInit();

}
