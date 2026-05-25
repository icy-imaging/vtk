// java wrapper for vtkTecplotTableReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTecplotTableReader extends vtkTableAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native long GetMaxRecords_6();
  public long GetMaxRecords()
  {
    return GetMaxRecords_6();
  }

  private native void SetMaxRecords_7(long id0);
  public void SetMaxRecords(long id0)
  {
    SetMaxRecords_7(id0);
  }

  private native long GetHeaderLines_8();
  public long GetHeaderLines()
  {
    return GetHeaderLines_8();
  }

  private native void SetHeaderLines_9(long id0);
  public void SetHeaderLines(long id0)
  {
    SetHeaderLines_9(id0);
  }

  private native long GetColumnNamesOnLine_10();
  public long GetColumnNamesOnLine()
  {
    return GetColumnNamesOnLine_10();
  }

  private native void SetColumnNamesOnLine_11(long id0);
  public void SetColumnNamesOnLine(long id0)
  {
    SetColumnNamesOnLine_11(id0);
  }

  private native long GetSkipColumnNames_12();
  public long GetSkipColumnNames()
  {
    return GetSkipColumnNames_12();
  }

  private native void SetSkipColumnNames_13(long id0);
  public void SetSkipColumnNames(long id0)
  {
    SetSkipColumnNames_13(id0);
  }

  private native void SetPedigreeIdArrayName_14(byte[] id0, int len0);
  public void SetPedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPedigreeIdArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetPedigreeIdArrayName_15();
  public String GetPedigreeIdArrayName()
  {
    return new String(GetPedigreeIdArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetGeneratePedigreeIds_16(boolean id0);
  public void SetGeneratePedigreeIds(boolean id0)
  {
    SetGeneratePedigreeIds_16(id0);
  }

  private native boolean GetGeneratePedigreeIds_17();
  public boolean GetGeneratePedigreeIds()
  {
    return GetGeneratePedigreeIds_17();
  }

  private native void GeneratePedigreeIdsOn_18();
  public void GeneratePedigreeIdsOn()
  {
    GeneratePedigreeIdsOn_18();
  }

  private native void GeneratePedigreeIdsOff_19();
  public void GeneratePedigreeIdsOff()
  {
    GeneratePedigreeIdsOff_19();
  }

  private native void SetOutputPedigreeIds_20(boolean id0);
  public void SetOutputPedigreeIds(boolean id0)
  {
    SetOutputPedigreeIds_20(id0);
  }

  private native boolean GetOutputPedigreeIds_21();
  public boolean GetOutputPedigreeIds()
  {
    return GetOutputPedigreeIds_21();
  }

  private native void OutputPedigreeIdsOn_22();
  public void OutputPedigreeIdsOn()
  {
    OutputPedigreeIdsOn_22();
  }

  private native void OutputPedigreeIdsOff_23();
  public void OutputPedigreeIdsOff()
  {
    OutputPedigreeIdsOff_23();
  }

  private native byte[] GetLastError_24();
  public String GetLastError()
  {
    return new String(GetLastError_24(), StandardCharsets.UTF_8);
  }

  public vtkTecplotTableReader() { super(); }

  public vtkTecplotTableReader(long id) { super(id); }
  public native long   VTKInit();

}
