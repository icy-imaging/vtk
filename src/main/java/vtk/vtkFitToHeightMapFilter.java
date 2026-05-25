// java wrapper for vtkFitToHeightMapFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFitToHeightMapFilter extends vtkPolyDataAlgorithm
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

  private native void SetHeightMapData_4(vtkImageData id0);
  public void SetHeightMapData(vtkImageData id0)
  {
    SetHeightMapData_4(id0);
  }

  private native void SetHeightMapConnection_5(vtkAlgorithmOutput id0);
  public void SetHeightMapConnection(vtkAlgorithmOutput id0)
  {
    SetHeightMapConnection_5(id0);
  }

  private native long GetHeightMap_6();
  public vtkImageData GetHeightMap()
  {
    long temp = GetHeightMap_6();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHeightMap_7(vtkInformationVector id0);
  public vtkImageData GetHeightMap(vtkInformationVector id0)
  {
    long temp = GetHeightMap_7(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFittingStrategy_8(int id0);
  public void SetFittingStrategy(int id0)
  {
    SetFittingStrategy_8(id0);
  }

  private native int GetFittingStrategy_9();
  public int GetFittingStrategy()
  {
    return GetFittingStrategy_9();
  }

  private native void SetFittingStrategyToPointProjection_10();
  public void SetFittingStrategyToPointProjection()
  {
    SetFittingStrategyToPointProjection_10();
  }

  private native void SetFittingStrategyToPointMinimumHeight_11();
  public void SetFittingStrategyToPointMinimumHeight()
  {
    SetFittingStrategyToPointMinimumHeight_11();
  }

  private native void SetFittingStrategyToPointMaximumHeight_12();
  public void SetFittingStrategyToPointMaximumHeight()
  {
    SetFittingStrategyToPointMaximumHeight_12();
  }

  private native void SetFittingStrategyToAverageHeight_13();
  public void SetFittingStrategyToAverageHeight()
  {
    SetFittingStrategyToAverageHeight_13();
  }

  private native void SetFittingStrategyToCellMinimumHeight_14();
  public void SetFittingStrategyToCellMinimumHeight()
  {
    SetFittingStrategyToCellMinimumHeight_14();
  }

  private native void SetFittingStrategyToCellMaximumHeight_15();
  public void SetFittingStrategyToCellMaximumHeight()
  {
    SetFittingStrategyToCellMaximumHeight_15();
  }

  private native void SetFittingStrategyToCellAverageHeight_16();
  public void SetFittingStrategyToCellAverageHeight()
  {
    SetFittingStrategyToCellAverageHeight_16();
  }

  private native void SetUseHeightMapOffset_17(int id0);
  public void SetUseHeightMapOffset(int id0)
  {
    SetUseHeightMapOffset_17(id0);
  }

  private native int GetUseHeightMapOffset_18();
  public int GetUseHeightMapOffset()
  {
    return GetUseHeightMapOffset_18();
  }

  private native void UseHeightMapOffsetOn_19();
  public void UseHeightMapOffsetOn()
  {
    UseHeightMapOffsetOn_19();
  }

  private native void UseHeightMapOffsetOff_20();
  public void UseHeightMapOffsetOff()
  {
    UseHeightMapOffsetOff_20();
  }

  public vtkFitToHeightMapFilter() { super(); }

  public vtkFitToHeightMapFilter(long id) { super(id); }
  public native long   VTKInit();

}
