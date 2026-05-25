// java wrapper for vtkXMLPMultiBlockDataWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLPMultiBlockDataWriter extends vtkXMLMultiBlockDataWriter
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

  private native void SetNumberOfPieces_4(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_4(id0);
  }

  private native int GetNumberOfPieces_5();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_5();
  }

  private native void SetStartPiece_6(int id0);
  public void SetStartPiece(int id0)
  {
    SetStartPiece_6(id0);
  }

  private native int GetStartPiece_7();
  public int GetStartPiece()
  {
    return GetStartPiece_7();
  }

  private native void SetController_8(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_8(id0);
  }

  private native long GetController_9();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_9();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWriteMetaFile_10(int id0);
  public void SetWriteMetaFile(int id0)
  {
    SetWriteMetaFile_10(id0);
  }

  public vtkXMLPMultiBlockDataWriter() { super(); }

  public vtkXMLPMultiBlockDataWriter(long id) { super(id); }
  public native long   VTKInit();

}
