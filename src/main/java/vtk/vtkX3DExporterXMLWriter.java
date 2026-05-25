// java wrapper for vtkX3DExporterXMLWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkX3DExporterXMLWriter extends vtkX3DExporterWriter
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

  private native void CloseFile_4();
  public void CloseFile()
  {
    CloseFile_4();
  }

  private native int OpenFile_5(byte[] id0, int len0);
  public int OpenFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return OpenFile_5(bytes0, bytes0.length);
  }

  private native void Flush_6();
  public void Flush()
  {
    Flush_6();
  }

  private native int OpenStream_7();
  public int OpenStream()
  {
    return OpenStream_7();
  }

  private native void StartDocument_8();
  public void StartDocument()
  {
    StartDocument_8();
  }

  private native void EndDocument_9();
  public void EndDocument()
  {
    EndDocument_9();
  }

  private native void StartNode_10(int id0);
  public void StartNode(int id0)
  {
    StartNode_10(id0);
  }

  private native void EndNode_11();
  public void EndNode()
  {
    EndNode_11();
  }

  private native void SetField_12(int id0,byte[] id1, int len1,boolean id2);
  public void SetField(int id0,String id1,boolean id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetField_12(id0,bytes1, bytes1.length,id2);
  }

  private native void SetField_13(int id0,int id1);
  public void SetField(int id0,int id1)
  {
    SetField_13(id0,id1);
  }

  private native void SetField_14(int id0,float id1);
  public void SetField(int id0,float id1)
  {
    SetField_14(id0,id1);
  }

  private native void SetField_15(int id0,double id1);
  public void SetField(int id0,double id1)
  {
    SetField_15(id0,id1);
  }

  private native void SetField_16(int id0,boolean id1);
  public void SetField(int id0,boolean id1)
  {
    SetField_16(id0,id1);
  }

  private native void SetField_17(int id0,int id1,vtkDataArray id2);
  public void SetField(int id0,int id1,vtkDataArray id2)
  {
    SetField_17(id0,id1,id2);
  }

  public vtkX3DExporterXMLWriter() { super(); }

  public vtkX3DExporterXMLWriter(long id) { super(id); }
  public native long   VTKInit();

}
