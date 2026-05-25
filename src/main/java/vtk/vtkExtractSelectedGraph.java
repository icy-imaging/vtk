// java wrapper for vtkExtractSelectedGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractSelectedGraph extends vtkGraphAlgorithm
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

  private native void SetSelectionConnection_4(vtkAlgorithmOutput id0);
  public void SetSelectionConnection(vtkAlgorithmOutput id0)
  {
    SetSelectionConnection_4(id0);
  }

  private native void SetAnnotationLayersConnection_5(vtkAlgorithmOutput id0);
  public void SetAnnotationLayersConnection(vtkAlgorithmOutput id0)
  {
    SetAnnotationLayersConnection_5(id0);
  }

  private native void SetRemoveIsolatedVertices_6(boolean id0);
  public void SetRemoveIsolatedVertices(boolean id0)
  {
    SetRemoveIsolatedVertices_6(id0);
  }

  private native boolean GetRemoveIsolatedVertices_7();
  public boolean GetRemoveIsolatedVertices()
  {
    return GetRemoveIsolatedVertices_7();
  }

  private native void RemoveIsolatedVerticesOn_8();
  public void RemoveIsolatedVerticesOn()
  {
    RemoveIsolatedVerticesOn_8();
  }

  private native void RemoveIsolatedVerticesOff_9();
  public void RemoveIsolatedVerticesOff()
  {
    RemoveIsolatedVerticesOff_9();
  }

  private native int FillInputPortInformation_10(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_10(id0,id1);
  }

  public vtkExtractSelectedGraph() { super(); }

  public vtkExtractSelectedGraph(long id) { super(id); }
  public native long   VTKInit();

}
