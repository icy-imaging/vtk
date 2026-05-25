// java wrapper for vtkCompositeDataPipeline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeDataPipeline extends vtkStreamingDemandDrivenPipeline
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

  private native long GetCompositeOutputData_4(int id0);
  public vtkDataObject GetCompositeOutputData(int id0)
  {
    long temp = GetCompositeOutputData_4(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long LOAD_REQUESTED_BLOCKS_5();
  public vtkInformationIntegerKey LOAD_REQUESTED_BLOCKS()
  {
    long temp = LOAD_REQUESTED_BLOCKS_5();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long COMPOSITE_DATA_META_DATA_6();
  public vtkInformationObjectBaseKey COMPOSITE_DATA_META_DATA()
  {
    long temp = COMPOSITE_DATA_META_DATA_6();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_COMPOSITE_INDICES_7();
  public vtkInformationIntegerVectorKey UPDATE_COMPOSITE_INDICES()
  {
    long temp = UPDATE_COMPOSITE_INDICES_7();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long BLOCK_AMOUNT_OF_DETAIL_8();
  public vtkInformationDoubleKey BLOCK_AMOUNT_OF_DETAIL()
  {
    long temp = BLOCK_AMOUNT_OF_DETAIL_8();

    if (temp == 0) return null;
    return (vtkInformationDoubleKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCompositeDataPipeline() { super(); }

  public vtkCompositeDataPipeline(long id) { super(id); }
  public native long   VTKInit();

}
