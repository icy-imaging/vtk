// java wrapper for vtkX3DExporterFIWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkX3DExporterFIWriter extends vtkX3DExporterWriter
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

  private native int OpenStream_6();
  public int OpenStream()
  {
    return OpenStream_6();
  }

  private native void Flush_7();
  public void Flush()
  {
    Flush_7();
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

  private native void SetField_18(int id0,int id1,vtkCellArray id2);
  public void SetField(int id0,int id1,vtkCellArray id2)
  {
    SetField_18(id0,id1,id2);
  }

  private native void SetFastest_19(int id0);
  public void SetFastest(int id0)
  {
    SetFastest_19(id0);
  }

  private native int GetFastestMinValue_20();
  public int GetFastestMinValue()
  {
    return GetFastestMinValue_20();
  }

  private native int GetFastestMaxValue_21();
  public int GetFastestMaxValue()
  {
    return GetFastestMaxValue_21();
  }

  private native void FastestOn_22();
  public void FastestOn()
  {
    FastestOn_22();
  }

  private native void FastestOff_23();
  public void FastestOff()
  {
    FastestOff_23();
  }

  private native int GetFastest_24();
  public int GetFastest()
  {
    return GetFastest_24();
  }

  public vtkX3DExporterFIWriter() { super(); }

  public vtkX3DExporterFIWriter(long id) { super(id); }
  public native long   VTKInit();

}
