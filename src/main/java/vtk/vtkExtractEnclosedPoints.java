// java wrapper for vtkExtractEnclosedPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractEnclosedPoints extends vtkPointCloudFilter
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

  private native void SetSurfaceData_4(vtkPolyData id0);
  public void SetSurfaceData(vtkPolyData id0)
  {
    SetSurfaceData_4(id0);
  }

  private native void SetSurfaceConnection_5(vtkAlgorithmOutput id0);
  public void SetSurfaceConnection(vtkAlgorithmOutput id0)
  {
    SetSurfaceConnection_5(id0);
  }

  private native long GetSurface_6();
  public vtkPolyData GetSurface()
  {
    long temp = GetSurface_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurface_7(vtkInformationVector id0);
  public vtkPolyData GetSurface(vtkInformationVector id0)
  {
    long temp = GetSurface_7(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCheckSurface_8(int id0);
  public void SetCheckSurface(int id0)
  {
    SetCheckSurface_8(id0);
  }

  private native void CheckSurfaceOn_9();
  public void CheckSurfaceOn()
  {
    CheckSurfaceOn_9();
  }

  private native void CheckSurfaceOff_10();
  public void CheckSurfaceOff()
  {
    CheckSurfaceOff_10();
  }

  private native int GetCheckSurface_11();
  public int GetCheckSurface()
  {
    return GetCheckSurface_11();
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetToleranceMinValue_13();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_13();
  }

  private native double GetToleranceMaxValue_14();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_14();
  }

  private native double GetTolerance_15();
  public double GetTolerance()
  {
    return GetTolerance_15();
  }

  public vtkExtractEnclosedPoints() { super(); }

  public vtkExtractEnclosedPoints(long id) { super(id); }
  public native long   VTKInit();

}
