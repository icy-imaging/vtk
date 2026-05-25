// java wrapper for vtkMaskFields object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMaskFields extends vtkDataSetAlgorithm
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

  private native void CopyFieldOn_4(int id0,byte[] id1, int len1);
  public void CopyFieldOn(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    CopyFieldOn_4(id0,bytes1, bytes1.length);
  }

  private native void CopyFieldOff_5(int id0,byte[] id1, int len1);
  public void CopyFieldOff(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    CopyFieldOff_5(id0,bytes1, bytes1.length);
  }

  private native void CopyAttributeOn_6(int id0,int id1);
  public void CopyAttributeOn(int id0,int id1)
  {
    CopyAttributeOn_6(id0,id1);
  }

  private native void CopyAttributeOff_7(int id0,int id1);
  public void CopyAttributeOff(int id0,int id1)
  {
    CopyAttributeOff_7(id0,id1);
  }

  private native void CopyFieldsOff_8();
  public void CopyFieldsOff()
  {
    CopyFieldsOff_8();
  }

  private native void CopyAttributesOff_9();
  public void CopyAttributesOff()
  {
    CopyAttributesOff_9();
  }

  private native void CopyFieldsOn_10();
  public void CopyFieldsOn()
  {
    CopyFieldsOn_10();
  }

  private native void CopyAttributesOn_11();
  public void CopyAttributesOn()
  {
    CopyAttributesOn_11();
  }

  private native void CopyAttributeOn_12(byte[] id0, int len0,byte[] id1, int len1);
  public void CopyAttributeOn(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    CopyAttributeOn_12(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void CopyAttributeOff_13(byte[] id0, int len0,byte[] id1, int len1);
  public void CopyAttributeOff(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    CopyAttributeOff_13(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void CopyFieldOn_14(byte[] id0, int len0,byte[] id1, int len1);
  public void CopyFieldOn(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    CopyFieldOn_14(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void CopyFieldOff_15(byte[] id0, int len0,byte[] id1, int len1);
  public void CopyFieldOff(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    CopyFieldOff_15(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void CopyAllOn_16();
  public void CopyAllOn()
  {
    CopyAllOn_16();
  }

  private native void CopyAllOff_17();
  public void CopyAllOff()
  {
    CopyAllOff_17();
  }

  public vtkMaskFields() { super(); }

  public vtkMaskFields(long id) { super(id); }
  public native long   VTKInit();

}
