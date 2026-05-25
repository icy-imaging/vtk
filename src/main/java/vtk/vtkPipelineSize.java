// java wrapper for vtkPipelineSize object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPipelineSize extends vtkObject
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

  private native long GetEstimatedSize_4(vtkAlgorithm id0,int id1,int id2);
  public long GetEstimatedSize(vtkAlgorithm id0,int id1,int id2)
  {
    return GetEstimatedSize_4(id0,id1,id2);
  }

  private native long GetNumberOfSubPieces_5(long id0,vtkAlgorithm id1,int id2,int id3);
  public long GetNumberOfSubPieces(long id0,vtkAlgorithm id1,int id2,int id3)
  {
    return GetNumberOfSubPieces_5(id0,id1,id2,id3);
  }

  public vtkPipelineSize() { super(); }

  public vtkPipelineSize(long id) { super(id); }
  public native long   VTKInit();

}
