// java wrapper for vtkTimePointUtility object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTimePointUtility extends vtkObject
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

  private native long DateToTimePoint_4(int id0,int id1,int id2);
  public long DateToTimePoint(int id0,int id1,int id2)
  {
    return DateToTimePoint_4(id0,id1,id2);
  }

  private native long TimeToTimePoint_5(int id0,int id1,int id2,int id3);
  public long TimeToTimePoint(int id0,int id1,int id2,int id3)
  {
    return TimeToTimePoint_5(id0,id1,id2,id3);
  }

  private native long DateTimeToTimePoint_6(int id0,int id1,int id2,int id3,int id4,int id5,int id6);
  public long DateTimeToTimePoint(int id0,int id1,int id2,int id3,int id4,int id5,int id6)
  {
    return DateTimeToTimePoint_6(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int GetYear_7(long id0);
  public int GetYear(long id0)
  {
    return GetYear_7(id0);
  }

  private native int GetMonth_8(long id0);
  public int GetMonth(long id0)
  {
    return GetMonth_8(id0);
  }

  private native int GetDay_9(long id0);
  public int GetDay(long id0)
  {
    return GetDay_9(id0);
  }

  private native int GetHour_10(long id0);
  public int GetHour(long id0)
  {
    return GetHour_10(id0);
  }

  private native int GetMinute_11(long id0);
  public int GetMinute(long id0)
  {
    return GetMinute_11(id0);
  }

  private native int GetSecond_12(long id0);
  public int GetSecond(long id0)
  {
    return GetSecond_12(id0);
  }

  private native int GetMillisecond_13(long id0);
  public int GetMillisecond(long id0)
  {
    return GetMillisecond_13(id0);
  }

  private native byte[] TimePointToISO8601_14(long id0,int id1);
  public String TimePointToISO8601(long id0,int id1)
  {
    return new String(TimePointToISO8601_14(id0,id1), StandardCharsets.UTF_8);
  }

  public vtkTimePointUtility() { super(); }

  public vtkTimePointUtility(long id) { super(id); }
  public native long   VTKInit();

}
