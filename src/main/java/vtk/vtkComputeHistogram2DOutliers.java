// java wrapper for vtkComputeHistogram2DOutliers object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkComputeHistogram2DOutliers extends vtkSelectionAlgorithm
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

  private native void SetPreferredNumberOfOutliers_4(int id0);
  public void SetPreferredNumberOfOutliers(int id0)
  {
    SetPreferredNumberOfOutliers_4(id0);
  }

  private native int GetPreferredNumberOfOutliers_5();
  public int GetPreferredNumberOfOutliers()
  {
    return GetPreferredNumberOfOutliers_5();
  }

  private native long GetOutputTable_6();
  public vtkTable GetOutputTable()
  {
    long temp = GetOutputTable_6();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputTableConnection_7(vtkAlgorithmOutput id0);
  public void SetInputTableConnection(vtkAlgorithmOutput id0)
  {
    SetInputTableConnection_7(id0);
  }

  private native void SetInputHistogramImageDataConnection_8(vtkAlgorithmOutput id0);
  public void SetInputHistogramImageDataConnection(vtkAlgorithmOutput id0)
  {
    SetInputHistogramImageDataConnection_8(id0);
  }

  private native void SetInputHistogramMultiBlockConnection_9(vtkAlgorithmOutput id0);
  public void SetInputHistogramMultiBlockConnection(vtkAlgorithmOutput id0)
  {
    SetInputHistogramMultiBlockConnection_9(id0);
  }

  public vtkComputeHistogram2DOutliers() { super(); }

  public vtkComputeHistogram2DOutliers(long id) { super(id); }
  public native long   VTKInit();

}
