// java wrapper for vtkNetCDFCFWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNetCDFCFWriter extends vtkWriter
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetCellArrayNamePostfix_6(byte[] id0, int len0);
  public void SetCellArrayNamePostfix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayNamePostfix_6(bytes0, bytes0.length);
  }

  private native byte[] GetCellArrayNamePostfix_7();
  public String GetCellArrayNamePostfix()
  {
    return new String(GetCellArrayNamePostfix_7(), StandardCharsets.UTF_8);
  }

  private native void SetFillValue_8(int id0);
  public void SetFillValue(int id0)
  {
    SetFillValue_8(id0);
  }

  private native int GetFillValue_9();
  public int GetFillValue()
  {
    return GetFillValue_9();
  }

  private native void SetAttributeType_10(int id0);
  public void SetAttributeType(int id0)
  {
    SetAttributeType_10(id0);
  }

  private native int GetAttributeType_11();
  public int GetAttributeType()
  {
    return GetAttributeType_11();
  }

  private native void SetFillBlankedAttributes_12(boolean id0);
  public void SetFillBlankedAttributes(boolean id0)
  {
    SetFillBlankedAttributes_12(id0);
  }

  private native boolean GetFillBlankedAttributes_13();
  public boolean GetFillBlankedAttributes()
  {
    return GetFillBlankedAttributes_13();
  }

  private native void FillBlankedAttributesOn_14();
  public void FillBlankedAttributesOn()
  {
    FillBlankedAttributesOn_14();
  }

  private native void FillBlankedAttributesOff_15();
  public void FillBlankedAttributesOff()
  {
    FillBlankedAttributesOff_15();
  }

  private native void AddGridMappingAttribute_16(byte[] id0, int len0,byte[] id1, int len1);
  public void AddGridMappingAttribute(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddGridMappingAttribute_16(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void AddGridMappingAttribute_17(byte[] id0, int len0,double id1);
  public void AddGridMappingAttribute(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddGridMappingAttribute_17(bytes0, bytes0.length,id1);
  }

  private native void ClearGridMappingAttributes_18();
  public void ClearGridMappingAttributes()
  {
    ClearGridMappingAttributes_18();
  }

  public vtkNetCDFCFWriter() { super(); }

  public vtkNetCDFCFWriter(long id) { super(id); }
  public native long   VTKInit();

}
