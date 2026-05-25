// java wrapper for vtkProjectedTerrainPath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProjectedTerrainPath extends vtkPolyDataAlgorithm
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

  private native void SetSourceData_4(vtkImageData id0);
  public void SetSourceData(vtkImageData id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkImageData GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_6(id0);
  }

  private native void SetProjectionMode_7(int id0);
  public void SetProjectionMode(int id0)
  {
    SetProjectionMode_7(id0);
  }

  private native int GetProjectionModeMinValue_8();
  public int GetProjectionModeMinValue()
  {
    return GetProjectionModeMinValue_8();
  }

  private native int GetProjectionModeMaxValue_9();
  public int GetProjectionModeMaxValue()
  {
    return GetProjectionModeMaxValue_9();
  }

  private native int GetProjectionMode_10();
  public int GetProjectionMode()
  {
    return GetProjectionMode_10();
  }

  private native void SetProjectionModeToSimple_11();
  public void SetProjectionModeToSimple()
  {
    SetProjectionModeToSimple_11();
  }

  private native void SetProjectionModeToNonOccluded_12();
  public void SetProjectionModeToNonOccluded()
  {
    SetProjectionModeToNonOccluded_12();
  }

  private native void SetProjectionModeToHug_13();
  public void SetProjectionModeToHug()
  {
    SetProjectionModeToHug_13();
  }

  private native void SetHeightOffset_14(double id0);
  public void SetHeightOffset(double id0)
  {
    SetHeightOffset_14(id0);
  }

  private native double GetHeightOffset_15();
  public double GetHeightOffset()
  {
    return GetHeightOffset_15();
  }

  private native void SetHeightTolerance_16(double id0);
  public void SetHeightTolerance(double id0)
  {
    SetHeightTolerance_16(id0);
  }

  private native double GetHeightToleranceMinValue_17();
  public double GetHeightToleranceMinValue()
  {
    return GetHeightToleranceMinValue_17();
  }

  private native double GetHeightToleranceMaxValue_18();
  public double GetHeightToleranceMaxValue()
  {
    return GetHeightToleranceMaxValue_18();
  }

  private native double GetHeightTolerance_19();
  public double GetHeightTolerance()
  {
    return GetHeightTolerance_19();
  }

  private native void SetMaximumNumberOfLines_20(long id0);
  public void SetMaximumNumberOfLines(long id0)
  {
    SetMaximumNumberOfLines_20(id0);
  }

  private native long GetMaximumNumberOfLinesMinValue_21();
  public long GetMaximumNumberOfLinesMinValue()
  {
    return GetMaximumNumberOfLinesMinValue_21();
  }

  private native long GetMaximumNumberOfLinesMaxValue_22();
  public long GetMaximumNumberOfLinesMaxValue()
  {
    return GetMaximumNumberOfLinesMaxValue_22();
  }

  private native long GetMaximumNumberOfLines_23();
  public long GetMaximumNumberOfLines()
  {
    return GetMaximumNumberOfLines_23();
  }

  public vtkProjectedTerrainPath() { super(); }

  public vtkProjectedTerrainPath(long id) { super(id); }
  public native long   VTKInit();

}
