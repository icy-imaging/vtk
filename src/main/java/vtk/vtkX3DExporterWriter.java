// java wrapper for vtkX3DExporterWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkX3DExporterWriter extends vtkObject
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

  private native int OpenFile_4(byte[] id0, int len0);
  public int OpenFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return OpenFile_4(bytes0, bytes0.length);
  }

  private native int OpenStream_5();
  public int OpenStream()
  {
    return OpenStream_5();
  }

  private native void SetWriteToOutputString_6(int id0);
  public void SetWriteToOutputString(int id0)
  {
    SetWriteToOutputString_6(id0);
  }

  private native int GetWriteToOutputString_7();
  public int GetWriteToOutputString()
  {
    return GetWriteToOutputString_7();
  }

  private native void WriteToOutputStringOn_8();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_8();
  }

  private native void WriteToOutputStringOff_9();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_9();
  }

  private native long GetOutputStringLength_10();
  public long GetOutputStringLength()
  {
    return GetOutputStringLength_10();
  }

  private native byte[] GetOutputString_11();
  public String GetOutputString()
  {
    return new String(GetOutputString_11(), StandardCharsets.UTF_8);
  }

  private native byte[] RegisterAndGetOutputString_12();
  public String RegisterAndGetOutputString()
  {
    return new String(RegisterAndGetOutputString_12(), StandardCharsets.UTF_8);
  }

  private native void CloseFile_13();
  public void CloseFile()
  {
    CloseFile_13();
  }

  private native void Flush_14();
  public void Flush()
  {
    Flush_14();
  }

  private native void StartDocument_15();
  public void StartDocument()
  {
    StartDocument_15();
  }

  private native void EndDocument_16();
  public void EndDocument()
  {
    EndDocument_16();
  }

  private native void StartNode_17(int id0);
  public void StartNode(int id0)
  {
    StartNode_17(id0);
  }

  private native void EndNode_18();
  public void EndNode()
  {
    EndNode_18();
  }

  private native void SetField_19(int id0,byte[] id1, int len1,boolean id2);
  public void SetField(int id0,String id1,boolean id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetField_19(id0,bytes1, bytes1.length,id2);
  }

  private native void SetField_20(int id0,int id1);
  public void SetField(int id0,int id1)
  {
    SetField_20(id0,id1);
  }

  private native void SetField_21(int id0,float id1);
  public void SetField(int id0,float id1)
  {
    SetField_21(id0,id1);
  }

  private native void SetField_22(int id0,double id1);
  public void SetField(int id0,double id1)
  {
    SetField_22(id0,id1);
  }

  private native void SetField_23(int id0,boolean id1);
  public void SetField(int id0,boolean id1)
  {
    SetField_23(id0,id1);
  }

  private native void SetField_24(int id0,int id1,vtkDataArray id2);
  public void SetField(int id0,int id1,vtkDataArray id2)
  {
    SetField_24(id0,id1,id2);
  }

  public vtkX3DExporterWriter() { super(); }

  public vtkX3DExporterWriter(long id) { super(id); }

}
