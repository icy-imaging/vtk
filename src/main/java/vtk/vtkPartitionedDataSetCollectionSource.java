// java wrapper for vtkPartitionedDataSetCollectionSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPartitionedDataSetCollectionSource extends vtkPartitionedDataSetCollectionAlgorithm
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

  private native void SetNumberOfShapes_4(int id0);
  public void SetNumberOfShapes(int id0)
  {
    SetNumberOfShapes_4(id0);
  }

  private native int GetNumberOfShapesMinValue_5();
  public int GetNumberOfShapesMinValue()
  {
    return GetNumberOfShapesMinValue_5();
  }

  private native int GetNumberOfShapesMaxValue_6();
  public int GetNumberOfShapesMaxValue()
  {
    return GetNumberOfShapesMaxValue_6();
  }

  private native int GetNumberOfShapes_7();
  public int GetNumberOfShapes()
  {
    return GetNumberOfShapes_7();
  }

  public vtkPartitionedDataSetCollectionSource() { super(); }

  public vtkPartitionedDataSetCollectionSource(long id) { super(id); }
  public native long   VTKInit();

}
